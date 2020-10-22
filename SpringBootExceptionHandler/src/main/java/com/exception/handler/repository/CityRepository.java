package com.exception.handler.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exception.handler.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}