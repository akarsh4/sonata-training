package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.impl.Defaultadd;

class AddTestCase {

	@Test
	void addTest1() {
	Addinterface add  = new Defaultadd();
	assertEquals(20,add.additi(10, 10));
	}
	@Test
	void addTest2() {
		Addinterface add =  new Defaultadd();
		assertEquals(50,add.additi(20,10));
	}
	@Test
	void addTest3() {
		Addinterface add =  new Defaultadd();
		assertEquals(50,add.additi(20,30));
	}
	@Test
	void subTest4() {
		Addinterface subt =  new Defaultadd();
		assertEquals(50,subt.subtract(80,30));
	}
}
