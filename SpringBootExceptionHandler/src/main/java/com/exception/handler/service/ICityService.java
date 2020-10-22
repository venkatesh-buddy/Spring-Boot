package com.exception.handler.service;

import java.util.List;

import com.exception.handler.model.City;

public interface ICityService {

    City findById(Long id);
    City save(City city);
    List<City> findAll();
}