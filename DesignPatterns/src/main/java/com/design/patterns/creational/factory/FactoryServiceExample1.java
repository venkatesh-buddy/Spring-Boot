package com.design.patterns.creational.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryServiceExample1 {
	
	@Autowired
	private MyServiceFactory myServiceFactory;
	
	
	public MyService getServiceImp(Integer id) {
		return myServiceFactory.getServiceImpl(id);
	}

}
