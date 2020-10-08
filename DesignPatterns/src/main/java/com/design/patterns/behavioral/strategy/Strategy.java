package com.design.patterns.behavioral.strategy;

import java.math.BigDecimal;

public interface Strategy {
	BigDecimal doCalculation(BigDecimal a, BigDecimal b);
}
