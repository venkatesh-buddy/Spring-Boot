package com.design.patterns.creational.factory;

import org.springframework.stereotype.Service;

@Service
public class MyServiceThree implements MyService{

	@Override
	public Integer getType() {
		return 3;
	}

	@Override
	public String checkImplementation() {
		return "MyService Three";
		
	}

}
