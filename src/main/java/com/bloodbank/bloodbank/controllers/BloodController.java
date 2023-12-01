package com.bloodbank.bloodbank.controllers;

import com.bloodbank.bloodbank.model.blood.Blood;
import com.bloodbank.bloodbank.service.BloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blood")
public class BloodController {

    @Autowired
    private final BloodService bloodService;

    public BloodController(BloodService bloodService) {
        this.bloodService = bloodService;
    }

    @GetMapping
    public List<Blood> getAll() {
        return bloodService.getAll();
    }
}
