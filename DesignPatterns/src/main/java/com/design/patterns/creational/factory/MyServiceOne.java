package com.design.patterns.creational.factory;

import org.springframework.stereotype.Service;

@Service
public class MyServiceOne implements MyService {

	@Override
	public Integer getType() {		
		return 1;
	}

	@Override
	public String checkImplementation() {
		return "MyService One";
		
	}

}
