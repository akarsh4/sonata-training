package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
public class ArraListTest {
	
	@Test
	public void testAdd() {
	ArrayListDemo arr1 = new ArrayListDemo();
	arr1.add(1);
	arr1.add(2);
	arr1.add(3);
	arr1.add(4);
	arr1.add(5);
	arr1.add(6);
	
	int size=arr1.getSize();
	System.out.println(size);
	assertEquals(7,size);
	}

}
