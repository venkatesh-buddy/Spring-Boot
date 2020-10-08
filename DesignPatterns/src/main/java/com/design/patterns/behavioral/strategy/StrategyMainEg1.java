package com.design.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class StrategyMainEg1 {
	public static void main(String are[]) {
		Context c = new Context(new Addition());
		BigDecimal result = c.doOperation(new BigDecimal(10), new BigDecimal(15));
		System.out.println("Result::"+result);
	}

}
