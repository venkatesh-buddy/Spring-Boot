package com.design.patterns.creational.abstractfactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbstractFactoryController {
	
	
	//https://dzone.com/articles/abstract-factory-design-pattern
	
	@GetMapping("/abstractfactory/{value}")
	public String getAbstractFactory(@PathVariable("value") String value){
		 //drawing 2D shape
		AbstractFactory factory = null;
		GeometricShape shape = null;
		if(value.equalsIgnoreCase("two")) {
	         factory = FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY);
	        if (factory == null) {
	            return "Factory for given name doesn't exist.";            
	        }
	        //getting shape using factory obtained
	        shape = factory.getShape(ShapeType.LINE);
	        if (shape != null) {
	        	return shape.draw();
	        } else {
	        	return "Shape with given name doesn't exist.";
	        }
		} else {
	        //drawing 3D shape
	        factory = FactoryProvider.getFactory(FactoryType.THREE_D_SHAPE_FACTORY);
	        if (factory == null) {
	        	return "Factory for given name doesn't exist.";           
	        }
	        //getting shape using factory obtained
	        shape = factory.getShape(ShapeType.SPHERE);
	        if (shape != null) {
	         return   shape.draw();
	        } else {
	        	return "Shape with given name doesn't exist.";
	        }
		}   
    

	}

}
