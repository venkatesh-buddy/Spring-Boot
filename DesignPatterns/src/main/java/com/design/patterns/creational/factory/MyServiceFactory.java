package com.design.patterns.creational.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyServiceFactory {
	
	//@Autowired
	//private List<MyService> myServices;
	
	@Autowired
	public MyServiceFactory(List<MyService> myServices) {
		if(myServices!=null) {
			myServices.stream().forEach(m-> myServiceMap.put(m.getType(), m));
		}
	}
	
	public static final Map<Integer, MyService> myServiceMap = new HashMap<>();
	
	/*
	 * @PostConstruct public void initServices() { if(myServices!=null) {
	 * myServices.stream().forEach(m-> myServiceMap.put(m.getType(), m)); } }
	 */
	
	public MyService getServiceImpl(Integer typeId) {
		//if(typeId.equals(1))
			return myServiceMap.get(typeId);
	}
	
	
	

}
