package com.example;

import org.junit.Test;

import junit.framework.Assert;

public class FirstTest {

	@Test
	public void testMultiply() {
		Calculator tester = new Calculator();
		Assert.assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	}
	
	@Test
	public void testDivide() {
		Calculator tester = new Calculator();
		Assert.assertEquals("10 / 5 must be 2", 2, tester.divide(10, 5));
	}
	
	@Test
	public void testAdd() {
		Calculator tester = new Calculator();
		Assert.assertEquals("10 + 5 must be 15", 15, tester.add(10, 5));
	}
	
	@Test
	public void testSubtract() {
		Calculator tester = new Calculator();
		Assert.assertEquals("10 - 5 must be 5", 5, tester.subtract(10, 5));
	}
}
