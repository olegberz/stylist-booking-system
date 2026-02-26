package com.stylist.bookingservice.Service;

import com.stylist.Event.BookingCreatedEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookingEventPublisher {
    private final RabbitTemplate rabbitTemplate;

    public BookingEventPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publishBookingCreated(BookingCreatedEvent event) {
        rabbitTemplate.convertAndSend("bookingQueue", event);
    }
}