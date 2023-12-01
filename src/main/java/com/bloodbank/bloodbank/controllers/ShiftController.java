package com.bloodbank.bloodbank.controllers;

import com.bloodbank.bloodbank.model.Shift;
import com.bloodbank.bloodbank.service.ShiftService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shift")
public class ShiftController {
    private final ShiftService shiftService;

    public ShiftController(ShiftService shiftService) {
        this.shiftService = shiftService;
    }

    @GetMapping
    public List<Shift> getAll() {
        return shiftService.getAll();
    }
}
