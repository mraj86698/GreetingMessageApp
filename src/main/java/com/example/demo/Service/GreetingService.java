package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
	@Override
	public String getGreetingMessage(){
        return "Hello World!";
    }

}
