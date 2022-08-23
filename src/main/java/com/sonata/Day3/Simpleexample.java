package com.sonata.Day3;

public class Simpleexample {

	private int add(int a , int b) {
		return a+b;
		
	}
	int sub(int a, int b) {
		return  a-b;
	}
	
	protected int mul(int a , int b) {
		return a*b;
		
	}
	public int div(int a , int b) {
		return a/b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Simpleexample s1 = new Simpleexample();
System.out.println(s1.add(10, 30));
System.out.println(s1.sub(40, 20));
System.out.println(s1.mul(50, 5));
System.out.println(s1.div(500, 5));

	}

}
