package com.design.patterns.creational.singleton;

public class Singleton {
	public static Singleton instance;
	
	private Singleton() {
		
	}
	
	synchronized public static Singleton getInstance() {
		if(instance ==null) {
			synchronized(Singleton.class) {
				if(instance ==null) {
					return new Singleton();
				}
			}
			
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
}
