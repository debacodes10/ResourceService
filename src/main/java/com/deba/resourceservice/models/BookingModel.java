package com.deba.resourceservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "bookings")
public class BookingModel {

    @Id
    private String id;
    private String resourceId;
    private String clubId;
    private String eventId;
    private UserRef requestedBy;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Status status;

    public enum Status {
        PENDING, APPROVED, REJECTED
    }

    public BookingModel() {}

    public BookingModel (String resourceId, String clubId, String eventId, UserRef requestedBy, LocalDateTime startTime, LocalDateTime endTime, Status status) {
        BookingModel bookingModel = new BookingModel();
        this.resourceId = resourceId;
        this.clubId = clubId;
        this.eventId = eventId;
        this.requestedBy = requestedBy;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    public String getResourceId() {
        return resourceId;
    }

    public void setClubId(String clubId) {
        this.clubId = clubId;
    }
    public String getClubId() {
        return clubId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    public String getEventId() {
        return eventId;
    }

    public void setRequestedBy(UserRef requestedBy) {
        this.requestedBy = requestedBy;
    }
    public UserRef getRequestedBy() {
        return requestedBy;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }

}
