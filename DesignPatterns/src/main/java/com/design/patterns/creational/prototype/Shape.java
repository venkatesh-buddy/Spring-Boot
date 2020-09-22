package com.design.patterns.creational.prototype;

public abstract class Shape implements Cloneable {
	public String id;
	public String type;
	abstract String draw();
	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}	

	public void setId(String id) {
		this.id = id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
			clone = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	
	
	

}
