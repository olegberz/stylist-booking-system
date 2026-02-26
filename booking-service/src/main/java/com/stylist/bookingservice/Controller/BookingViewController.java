package com.stylist.bookingservice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booking")
public class BookingViewController {

    @GetMapping
    public String bookingForm() {
        return "booking";
    }
}