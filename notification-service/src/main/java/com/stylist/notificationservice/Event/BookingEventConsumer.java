package com.stylist.notificationservice.Event;

import com.stylist.Event.BookingCreatedEvent;
import com.stylist.notificationservice.Service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
public class BookingEventConsumer {

    private final EmailService emailService;

    public BookingEventConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "booking.created")
    public void handleBookingCreated(BookingCreatedEvent event) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");
        String formattedTime = event.getAppointmentTime().format(formatter);

        String to = event.getEmail();
        String subject = "Booking approved - look for details below.";
        String text = "Hello!\nYou booked: " +
                event.getServiceName().toLowerCase() + "\n" +
                "Details: " + event.getNotes() + "\n" +
                "Date: " + formattedTime;

        emailService.sendEmail(to, subject, text);
    }
}