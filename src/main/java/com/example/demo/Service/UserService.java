package com.example.demo.Service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.Model.User;


@Service
public abstract class UserService implements IUserService{
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    /**
     * Ability for the Greeting App to give Greeting message with just First Name or Last Name based on User attributes provides Just Hello World.
     */
    @Override
    public String getGreetingMessage(User user) {
        String name = user.toString().isEmpty() ? "Hello world " : user.toString();
        return String.format(template,name);
    }


}
