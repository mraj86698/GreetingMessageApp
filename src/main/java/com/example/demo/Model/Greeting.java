package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.example.demo.Dto.GreetingDto;

@Entity
public class Greeting {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String message;




    public Greeting(GreetingDto greetdto ) {
        this.name = greetdto.name;
        this.message =greetdto. message;
    }
    public Greeting(long incrementAndGet, String format) {

	}
	public void updateGreeting(GreetingDto greetdto ) {
        this.name = greetdto.name;
        this.message =greetdto. message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
