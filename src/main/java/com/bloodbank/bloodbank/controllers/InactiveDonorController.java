package com.bloodbank.bloodbank.controllers;

import com.bloodbank.bloodbank.model.InactiveDonor;
import com.bloodbank.bloodbank.service.InactiveDonorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inactive")
public class InactiveDonorController {
    private final InactiveDonorService inactiveDonorService;

    public InactiveDonorController(InactiveDonorService inactiveDonorService) {
        this.inactiveDonorService = inactiveDonorService;
    }

    @GetMapping
    public List<InactiveDonor> getAll() {
        return inactiveDonorService.getAll();
    }
}
