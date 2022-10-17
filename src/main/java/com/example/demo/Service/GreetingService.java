package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.GreetingDto;
import com.example.demo.Exception.UserException;
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

	@Override
	public Greeting getGreetingByid(long id){
        return gretRepo.findById(id).orElseThrow(() -> new UserException("User with Id " + id
                + " Doesn't Exists...!"));
    }
	/**
	 * Ability for the Greeting App to Edit a Greeting Messages in the Repository
	 */
	 @Override
		public Greeting updateGreeting(GreetingDto greetdto, long id) {
	        Greeting greeting=this.getGreetingByid(id);
	        if(greeting!=null){
	                greeting.updateGreeting(greetdto);
	                return gretRepo.save(greeting);
	        }
	        return null;
	    }

}