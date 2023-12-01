package com.bloodbank.bloodbank.service;

import com.bloodbank.bloodbank.model.BloodBank;
import com.bloodbank.bloodbank.repository.BloodBankDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodBankService implements IService<BloodBank> {
    private final BloodBankDAO bloodBankDAO;

    @Autowired
    public BloodBankService(BloodBankDAO bloodBankDAO) {
        this.bloodBankDAO = bloodBankDAO;
    }

    @Override
    public List<BloodBank> getAll() {
        return bloodBankDAO.findAll();
    }

}