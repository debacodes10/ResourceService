package com.deba.resourceservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "resource")
public class ResourceModel {

    @Id
    private String id;
    private String name;
    private Resource resource;
    private List<BookingRef> bookings;

    public enum Resource {
        ROOM, PROJECTOR, MIC, CABLE, SPEAKER
    }

    public ResourceModel() {}

    public ResourceModel(String name, Resource resource, List<BookingRef> bookings) {
        this.name = name;
        this.resource = resource;
        this.bookings = bookings;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Resource getResource() {
        return resource;
    }
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public List<BookingRef> getBookings() {
        return bookings;
    }
    public void setBookings(List<BookingRef> bookings) {
        this.bookings = bookings;
    }

}
