package com.example.demo.Service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserDto;
import com.example.demo.Exception.UserException;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepo;


@Service
public abstract class UserService implements IUserService{
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
	private UserRepo userRepo;

    /**
     * Ability for the Greeting App to give Greeting message with just First Name or Last Name based on User attributes provides Just Hello World.
     */
    @Override
    public String getGreetingMessage(User user) {
        String name = user.toString().isEmpty() ? "Hello world " : user.toString();
        return String.format(template,name);
    }
    @Override
	public User addUser(UserDto userdto) {
        User user = new User(userdto);
        return userRepo.save(user);
    }
    public User getUserByid(int id){
        return userRepo.findById(id).orElseThrow(() -> new UserException("User with Id " + id
                + " Doesn't Exists...!"));
    }


}
