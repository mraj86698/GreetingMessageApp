package com.example.demo.Model;

public class Greeting {

	private long id;
	private String name;
	private String message;

	public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
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
