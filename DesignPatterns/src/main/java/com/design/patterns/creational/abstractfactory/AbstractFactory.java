package com.design.patterns.creational.abstractfactory;
 
public abstract class AbstractFactory {
	
	abstract GeometricShape getShape(ShapeType shapeName);

}
