package com.bridgelabz.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void testAdd() {
		Arithmetic addition = new Arithmetic();

		assertEquals(10, addition.division(50, 5));
		assertEquals(4, addition.division(20, 5));
		assertEquals(0, addition.division(20, 0));
	}
	
}
