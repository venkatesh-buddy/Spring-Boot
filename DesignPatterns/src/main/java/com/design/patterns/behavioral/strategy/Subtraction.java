package com.design.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Subtraction implements Strategy {

	@Override
	public BigDecimal doCalculation(BigDecimal a, BigDecimal b) {		
		return a.subtract(b);
	}

}
