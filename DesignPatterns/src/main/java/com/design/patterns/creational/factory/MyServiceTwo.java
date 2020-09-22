package com.design.patterns.creational.factory;

import org.springframework.stereotype.Service;

@Service
public class MyServiceTwo implements MyService{

	@Override
	public Integer getType() {		
		return 2;
	}

	@Override
	public String checkImplementation() {
		return "My Service Two";
		
	}

}
