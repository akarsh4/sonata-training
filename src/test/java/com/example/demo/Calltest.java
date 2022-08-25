package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Calltest {

	Calculator c1 = new Calculator();
	@Test
	 void addTest() {
		Assertions.assertEquals(4,c1.add(2, 2));
	}
	@Test
    void divTest() {
	int x = c1.div(1, 1);
	assertThrows(ArithmeticException.class,()->c1.div(1, 0),"it is an error");
	}

}
