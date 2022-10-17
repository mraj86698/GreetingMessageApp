package com.example.demo.Service;

import com.example.demo.Dto.GreetingDto;
import com.example.demo.Model.Greeting;

public interface IGreetingService {
	String getGreetingMessage();

	public Greeting addGreeting(GreetingDto greetdto);

	Greeting getGreetByid(long id);

}
