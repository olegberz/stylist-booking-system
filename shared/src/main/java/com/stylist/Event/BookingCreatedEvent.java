package com.stylist.Event;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BookingCreatedEvent implements Serializable {
    private Long bookingId;
    private Long userId;
    private String serviceName;
    private String notes;
    private LocalDateTime appointmentTime;
    private String email;

    public BookingCreatedEvent() {
    }

    public BookingCreatedEvent(Long bookingId, Long userId, String serviceName, String notes, LocalDateTime appointmentTime, String email) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.serviceName = serviceName;
        this.appointmentTime = appointmentTime;
        this.email = email;
    }

    public Long getBookingId() { return bookingId; }
    public void setBookingId(Long bookingId) { this.bookingId = bookingId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getAppointmentTime() { return appointmentTime; }
    public void setAppointmentTime(LocalDateTime appointmentTime) { this.appointmentTime = appointmentTime; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}