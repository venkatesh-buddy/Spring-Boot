package com.design.patterns.creational;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.design.patterns.creational.factory.FactoryServiceExample1;

@RestController
public class FactoryController {
	
	@Autowired
	public FactoryServiceExample1 factoryService;
	
	@GetMapping("/factory/{id}")
	public String getFactoryExample(@PathVariable("id") Integer id) {
		return factoryService.getServiceImp(id).checkImplementation();
		
	}
	

}
