package com.bloodbank.bloodbank.service;

import java.util.List;

public interface IService<T> {
    List<T> getAll();
}
