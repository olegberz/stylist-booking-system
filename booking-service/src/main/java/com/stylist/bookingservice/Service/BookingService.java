package com.stylist.bookingservice.Service;

import com.stylist.Event.BookingCreatedEvent;
import com.stylist.bookingservice.Entity.Booking;
import com.stylist.bookingservice.Repository.BookingRepo;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
public class BookingService {

    private final BookingRepo bookingRepo;
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public BookingService(BookingRepo bookingRepo, RabbitTemplate rabbitTemplate) {
        this.bookingRepo = bookingRepo;
        this.rabbitTemplate = rabbitTemplate;
    }

    public Booking createBooking(Booking booking) {
        Booking saved = bookingRepo.save(booking);

        BookingCreatedEvent event = new BookingCreatedEvent();
        event.setBookingId(saved.getId());
        event.setUserId(saved.getUserId());
        event.setServiceName(saved.getServiceName());
        event.setNotes(saved.getNotes());
        event.setAppointmentTime(saved.getAppointmentTime());
        event.setEmail(saved.getEmail());

        rabbitTemplate.convertAndSend("booking.created", event);

        return saved;
    }
}