package com.sonata.Simple;
import com.sonata.Day3.Simpleexample;
public class PackageExample extends Simpleexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PackageExample p1 =new PackageExample();
		/*System.out.println(p1.add(10, 30));
		System.out.println(p1.sub(40, 20));*/
		System.out.println(p1.mul(50, 5));
		System.out.println(p1.div(500, 5));
		
		Simpleexample s2 = new Simpleexample();
	/*	System.out.println(s2.add(10, 30));
		System.out.println(s2.sub(40, 20));
		System.out.println(s2.mul(50, 5));*/
		System.out.println(s2.div(500, 5));

	}

}
