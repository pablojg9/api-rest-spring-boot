package com.project.api.rest.service;

import com.project.api.rest.model.Developer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeveloperService {

    List<Developer> developerList = new ArrayList<>();

    public Developer createDeveloper(Developer developer) {
        developerList.add(developer);

        return developerList.get(0);
    }

    public List<Developer> findDeveloper() {
        return developerList;
    }

    public void deleteDeveloper(Long id) {
        for (Developer dev : developerList) {
            if (dev.getId().equals(dev.getId())) {
                developerList.remove(dev);
            }
        }
    }

    public void updateDeveloper(Developer developer) {
        for (Developer dev : developerList) {
            if (dev.getId().equals(dev.getId())) {
                deleteDeveloper(developer.getId());
                createDeveloper(developer);
            }
        }
    }
}
