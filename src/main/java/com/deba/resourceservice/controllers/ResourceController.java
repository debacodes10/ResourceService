package com.deba.resourceservice.controllers;

import com.deba.resourceservice.models.ResourceModel;
import com.deba.resourceservice.services.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    /*---------------------------CREATE-------------------------*/
    @PostMapping("/")
    public ResourceModel createResource(@RequestBody ResourceModel resourceModel) {
        return resourceService.addResource(resourceModel);
    }

    /*---------------------------READ-------------------------*/
    @GetMapping("/{id}")
    public Optional<ResourceModel> getResourceById(@PathVariable String id) {
        return resourceService.getResourceById(id);
    }

    @GetMapping("/")
    public List<ResourceModel> getAllResources() {
        return resourceService.getAllResources();
    }

    @GetMapping("/name/{name}")
    public List<ResourceModel> getResourceByName(@PathVariable String name) {
        return resourceService.getResourcesByName(name);
    }

    /*---------------------------UPDATE-------------------------*/
    @PutMapping("/{id}")
    public Optional<ResourceModel> updateResourceById(@PathVariable String id, @RequestBody ResourceModel resourceModel) {
        return resourceService.updateResource(id, resourceModel);
    }

    /*---------------------------DELETE-------------------------*/
    @DeleteMapping("/{id}")
    public String deleteResourceById(@PathVariable String id) {
        boolean deleted = resourceService.deleteResource(id);
        return deleted ? "Resource deleted successfully." : "Resource not found.";
    }

}
