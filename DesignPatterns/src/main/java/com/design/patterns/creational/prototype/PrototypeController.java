package com.design.patterns.creational.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrototypeController {

	@Autowired
	ShapeCache shapeCache;
	
	@GetMapping("/prototype/{id}")
	public String getShape(@PathVariable("id") String id) throws CloneNotSupportedException {
		Shape s = shapeCache.getShape(id);
		return s.draw();
	}
}
