package com.example.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.model.Rental;
import com.example.mysql.rental.projection.RentalProjn;
import com.example.mysql.repository.RentalRepository;

@RestController 
public class RentController {
	
	@Autowired
	public RentalRepository rentalRepository;
	
	
	
	@GetMapping("/rental/projn/{id}")
	public RentalProjn getRentalByIdProjection(@PathVariable("id") Integer id) {
		RentalProjn o = rentalRepository.findByRentalId(id, RentalProjn.class);		
		return o;
	}
	
	@GetMapping("/rental/native/{id}")
	public Rental getRentalById(@PathVariable("id") Integer id) {
		Rental o = rentalRepository.getRentalByIdNativeQuery2(id);
		System.out.println("Payment Id::"+o.getCustomer().getPayments().get(0).getAmount());
		return o;
	}

}
