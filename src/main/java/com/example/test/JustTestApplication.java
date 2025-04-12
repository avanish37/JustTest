package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JustTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustTestApplication.class, args);
		System.out.println("Hello From Spring Boot Application...");
	}

}
