package com.project.api.rest.controller;

import com.project.api.rest.model.Client;
import com.project.api.rest.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/cliente")
    public List<Client> clientList() {
        return  clientRepository.findAll();
    }
}
