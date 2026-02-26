package com.stylist.bookingservice.Controller;

import com.stylist.bookingservice.Entity.Booking;
import com.stylist.bookingservice.Service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "http://localhost:8081")
public class RestController {

    private final BookingService bookingService;

    public RestController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        Booking saved = bookingService.createBooking(booking);
        return ResponseEntity.ok(saved);
    }
}
