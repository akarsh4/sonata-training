package com.sonata.Day4;

public class Calculator {
public int div(int a, int b) {
	return a/b;
}
public int  add(int a, int b) {
	return a+b;
}
public static void main(String args[]) {
	Calculator c1 = new Calculator();
	System.out.println(c1.div(10, 20));
	System.out.println(c1.div(10, 20));
}
}
