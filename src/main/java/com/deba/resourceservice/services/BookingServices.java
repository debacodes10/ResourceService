package com.deba.resourceservice.services;

import com.deba.resourceservice.models.BookingModel;
import com.deba.resourceservice.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BookingServices {

    @Autowired
    private BookingRepository bookingRepository;

    /*-----------------------CREATE--------------------------*/
    public BookingModel createBooking(BookingModel bookingModel) {
        return bookingRepository.save(bookingModel);
    }

    /*-----------------------READ--------------------------*/
    public List<BookingModel> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<BookingModel> getBookingById(String id) {
        return bookingRepository.findById(id);
    }

    public List<BookingModel> getBookingByResourceId(String resourceId) {
        return bookingRepository.findByResourceId(resourceId);
    }

    public List<BookingModel> getBookingByClubId(String clubId) {
        return bookingRepository.findByClubId(clubId);
    }

    public List<BookingModel> findBookingByEventId(String eventId) {
        return bookingRepository.findByEventId(eventId);
    }

    public List<BookingModel> findBookingByStatus(BookingModel.Status status) {
        return bookingRepository.findByStatus(status);
    }

    public List<BookingModel> findBookingByStartTimeBetween(LocalDateTime startTime, LocalDateTime endTime) {
        return bookingRepository.findByStartTimeBetween(startTime, endTime);
    }

    public List<BookingModel> findBookingByRequestedByUserId(String userId) {
        return bookingRepository.findByRequestedByUserId(userId);
    }

    /*-----------------------UPDATE--------------------------*/
    public Optional<BookingModel> updateBooking(String id, BookingModel bookingModel) {
        return bookingRepository.findById(id).map(booking -> {
            booking.setResourceId(bookingModel.getResourceId());
            booking.setStartTime(bookingModel.getStartTime());
            booking.setEndTime(bookingModel.getEndTime());
            booking.setClubId(bookingModel.getClubId());
            booking.setEventId(bookingModel.getEventId());
            booking.setStatus(bookingModel.getStatus());
            return bookingRepository.save(booking);
        });
    }

    /*-----------------------DELETE--------------------------*/
    public void deleteBooking(String id) {
        bookingRepository.deleteById(id);
    }

}
