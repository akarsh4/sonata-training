package com.sonata.Day3;

public class Manager extends Employee {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Manager m1 = new Manager();
  m1.salCal();
	}

	@Override
	public void salCal() {
		System.out.println("Manager gets hike");
		
	}

}
