package com.deba.resourceservice.repositories;

import com.deba.resourceservice.models.BookingRef;
import com.deba.resourceservice.models.ResourceModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ResourceRepository extends MongoRepository<ResourceModel, String> {

    List<ResourceModel> findByName(String name);


}
