package com.deba.resourceservice.repositories;

import com.deba.resourceservice.models.BookingModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface BookingRepository extends MongoRepository<BookingModel, String> {

    List<BookingModel> findByResourceId(String resourceId);

    List<BookingModel> findByClubId(String clubId);

    List<BookingModel> findByEventId(String eventId);

    List<BookingModel> findByStatus(BookingModel.Status status);

    List<BookingModel> findByStartTimeBetween(LocalDateTime start, LocalDateTime end);

    List<BookingModel> findByRequestedByUserId(String userId);

}
