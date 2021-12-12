package com.bridgelabz.Regex.entity;

public class User {
	private String firstName;
	private String lastName;
	private String eMail;

	public User(String firstName, String lastName, String eMail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
