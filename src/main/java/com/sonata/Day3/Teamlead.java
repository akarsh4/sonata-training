package com.sonata.Day3;

public class Teamlead extends Employee {

	@Override
	public void salCal() {
		System.out.println("Team leads gets bonus");
	}
	
	public static void main(String args[]) {
		Teamlead t1 = new Teamlead();
		t1.salCal();
	}

}
