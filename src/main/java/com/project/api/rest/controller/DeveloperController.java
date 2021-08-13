package com.project.api.rest.controller;

import com.project.api.rest.model.Developer;
import com.project.api.rest.repository.DeveloperRepository;
import com.project.api.rest.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeveloperController {

    @Autowired
    DeveloperRepository developerRepository;
    @Autowired
    DeveloperService developerService;

    @GetMapping("/search")
    public List<Developer> getAll() {
        return developerService.findDeveloper();

    }

    @DeleteMapping("/delete/id/{id}")
    public void deleteDeveloper(@PathVariable Long id) {
        developerService.deleteDeveloper(id);

    }

    @PostMapping("/create")
    public Developer insertDeveloper(@RequestBody Developer developer) {
        return developerService.createDeveloper(developer);

    }

    @PutMapping("/update")
    public void updateDeveloper(@RequestBody Developer developer) {
        developerService.updateDeveloper(developer);
    }
}
