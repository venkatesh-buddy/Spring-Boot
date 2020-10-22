package com.exception.handler.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.handler.model.City;
import com.exception.handler.service.ICityService;

@RestController
public class MyController {
	/**
	 * For h2 console
	 * http://localhost:8080/h2-console/
	 * in Jdbc url copy the Database available at in console of spring boot application
	 * no passord
	 * 
	 */

    @Autowired
    private ICityService cityService;

    @GetMapping(value = "/cities/{id}")
    public City getCity(@PathVariable Long id) {

        return cityService.findById(id);
    }

    @PostMapping(value = "/cities", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public City createCity(@RequestBody City city) {

        return cityService.save(city);
    }

    @GetMapping(value = "/cities")
    public List<City> findAll() {

        return cityService.findAll();
    }
}