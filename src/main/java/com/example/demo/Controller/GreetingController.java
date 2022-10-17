package com.example.demo.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/greetingUser")
@RestController
public class GreetingController {

	@Autowired
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();






}
