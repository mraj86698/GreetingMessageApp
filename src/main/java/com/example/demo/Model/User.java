package com.example.demo.Model;

public class User {

	private int id;
	private String firstname;
	private String lastname;



	public User( String firstname, String lastname) {
		super();

		this.firstname = firstname;
		this.lastname = lastname;
	}



	public User() {
		// TODO Auto-generated constructor stub
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
