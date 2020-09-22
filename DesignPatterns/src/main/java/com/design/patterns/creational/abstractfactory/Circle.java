package com.design.patterns.creational.abstractfactory;
public class Circle implements GeometricShape {
    @Override
    public String draw() {
       return "Circle is drawn.";
    }
}