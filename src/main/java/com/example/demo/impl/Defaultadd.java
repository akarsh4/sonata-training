package com.example.demo.impl;

import com.example.demo.Addinterface;

public class Defaultadd implements Addinterface {

	@Override
	public int additi(int no1, int no2) {
	
		return no1+no2;
	}
	
	@Override
	public int subtract(int n1, int n2) {
	
		return n1-n2;
	}
}