package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void testSuma() {
		assertEquals(5, App.sumar(2, 3));
	}
}
