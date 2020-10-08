package com.design.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Context {
	
	private Strategy strategy;
	
	Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public BigDecimal doOperation(BigDecimal a, BigDecimal b) {
		return this.strategy.doCalculation(a, b);
	}

}
