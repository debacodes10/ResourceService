package com.deba.resourceservice.controllers;

import com.deba.resourceservice.models.BookingModel;
import com.deba.resourceservice.services.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired
    private BookingServices bookingServices;

    /*-----------------------CREATE--------------------------*/
    @PostMapping("/")
    public BookingModel createBooking(@RequestBody BookingModel bookingModel) {
        return bookingServices.createBooking(bookingModel);
    }

    /*-----------------------READ--------------------------*/
    @GetMapping("/")
    public List<BookingModel> findAllBookings() {
        return bookingServices.getAllBookings();
    }

    @GetMapping("/{id}")
    public Optional<BookingModel> findBookingById(@PathVariable String id) {
        return bookingServices.getBookingById(id);
    }

    @GetMapping("/resource/{resourceId}")
    public List<BookingModel> findBookingByResourceId(@PathVariable String resourceId) {
        return bookingServices.getBookingByResourceId(resourceId);
    }

    @GetMapping("/club/{clubId}")
    public List<BookingModel> findBookingByClubId(@PathVariable String clubId) {
        return bookingServices.getBookingByClubId(clubId);
    }

    @GetMapping("/event/{eventId}")
    public List<BookingModel> findBookingByEventId(@PathVariable String eventId) {
        return bookingServices.findBookingByEventId(eventId);
    }

    @GetMapping("/status/{status}")
    public List<BookingModel> findBookingByStatus(@PathVariable BookingModel.Status status) {
        return bookingServices.findBookingByStatus(status);
    }

    @GetMapping("/time-between")
    public List<BookingModel> findBookingByStartTimeBetween(@RequestParam LocalDateTime startTime, @RequestParam LocalDateTime endTime) {
        return bookingServices.findBookingByStartTimeBetween(startTime, endTime);
    }

    @GetMapping("/requested-user/{userId}")
    public List<BookingModel> findBookingByRequestedUser(@PathVariable String userId) {
        return bookingServices.findBookingByRequestedByUserId(userId);
    }

    /*-----------------------UPDATE--------------------------*/
    @PutMapping("/{id}")
    public Optional<BookingModel> updateBooking(@PathVariable String id, @RequestBody BookingModel bookingModel) {
        return bookingServices.updateBooking(id, bookingModel);
    }

    /*-----------------------DELETE--------------------------*/
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable String id) {
        bookingServices.deleteBooking(id);
    }

}
