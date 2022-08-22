package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.impl.Defaultadd;

@SpringBootApplication
public class SonatatrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonatatrainingApplication.class, args);
		Addinterface adition = new Defaultadd();
		System.out.println(adition.additi(10,20));
		Addinterface sub = new Defaultadd();
		System.out.println(sub.subtract(10,20));
	}

}