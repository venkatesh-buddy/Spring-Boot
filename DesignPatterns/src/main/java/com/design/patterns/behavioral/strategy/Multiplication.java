package com.design.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Multiplication implements Strategy {

	@Override
	public BigDecimal doCalculation(BigDecimal a, BigDecimal b) {		
		return a.multiply(b);
	}

}
