package com.design.patterns.creational.abstractfactory;
public class Sphere implements GeometricShape {
    @Override
    public String draw() {
       return "Sphere drawn.";
    }
}