package com.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ShapeCache {
	//https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
	
	@Autowired
	private Circle c;
	@Autowired
	private Square s;
	
	
	private Map<String, Shape> shapeMap = new HashMap<>();
	
	public Shape getShape(String shapeId) throws CloneNotSupportedException {
		Shape s = shapeMap.get(shapeId);
		return (Shape)s.clone();
		
	}
	@PostConstruct
	public  void loadCache() {
		//Circle c = new Circle();
		c.setId("1");
		//Square s = new Square();
		s.setId("2");
		shapeMap.put(c.getId(), c);
		shapeMap.put(s.getId(), s);
		
	}

}
