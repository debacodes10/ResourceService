package com.deba.resourceservice.services;

import com.deba.resourceservice.models.ResourceModel;
import com.deba.resourceservice.repositories.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    /*---------------------------CREATE-------------------------*/
    public ResourceModel addResource(ResourceModel resourceModel) {
        return resourceRepository.save(resourceModel);
    }

    /*---------------------------READ-------------------------*/
    public List<ResourceModel> getAllResources() {
        return resourceRepository.findAll();
    }

    public Optional<ResourceModel> getResourceById(String id) {
        return resourceRepository.findById(id);
    }

    public List<ResourceModel> getResourcesByName(String name) {
        return resourceRepository.findByName(name);
    }

    /*---------------------------UPDATE-------------------------*/
    public Optional<ResourceModel> updateResource(String id, ResourceModel updatedResource) {
        return resourceRepository.findById(id).map(existingResource -> {
            existingResource.setName(updatedResource.getName());
            existingResource.setResource(updatedResource.getResource());
            existingResource.setBookings(updatedResource.getBookings());
            return resourceRepository.save(existingResource);
        });
    }

    /*---------------------------DELETE-------------------------*/
    public boolean deleteResource(String id) {
        if (resourceRepository.existsById(id)) {
            resourceRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
