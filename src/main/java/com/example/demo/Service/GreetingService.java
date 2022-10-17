package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.GreetingDto;
import com.example.demo.Model.Greeting;
import com.example.demo.Repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService {
	 @Autowired
	    private GreetingRepository gretRepo;

	@Override
	public String getGreetingMessage(){
        return "Hello World!";
    }

	@Override
	public Greeting addGreeting(GreetingDto greetdto) {
        Greeting greet = new Greeting(greetdto);
        return gretRepo.save(greet);
    }

}