package com.bloodbank.bloodbank.service;

import com.bloodbank.bloodbank.model.blood.Blood;
import com.bloodbank.bloodbank.repository.BloodDAO;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodService implements IService<Blood> {

    private final BloodDAO bloodDAO;

    @Autowired
    public BloodService(BloodDAO bloodDAO) {
        this.bloodDAO = bloodDAO;
    }

    @Override
    public List<Blood> getAll() {
        return bloodDAO.findAllBlood();
    }
}
