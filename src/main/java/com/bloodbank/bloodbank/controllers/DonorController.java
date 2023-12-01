package com.bloodbank.bloodbank.controllers;

import com.bloodbank.bloodbank.model.Donor;
import com.bloodbank.bloodbank.service.DonorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/donor")
public class DonorController {

    private final DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @GetMapping
    public List<Donor> getAll() {
        return donorService.getAll();
    }
}
