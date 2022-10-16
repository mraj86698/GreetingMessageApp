package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingMessageAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingMessageAppApplication.class, args);
		System.out.println("Welcome To Greeting Message App");
	}

}
