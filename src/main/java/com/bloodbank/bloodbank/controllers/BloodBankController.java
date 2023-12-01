package com.bloodbank.bloodbank.controllers;

import com.bloodbank.bloodbank.model.BloodBank;
import com.bloodbank.bloodbank.service.BloodBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BloodBankController {

    @Autowired
    private BloodBankService bloodBankService;

    @GetMapping
    public List<BloodBank> getAll() {
        return bloodBankService.getAll();
    }
}
