package com.bridgelabz.Regex.services;

import java.util.regex.Pattern;

import com.bridgelabz.Regex.entity.User;
import com.bridgelabz.Regex.interfaces.IUser;

public class UserRegistrationImpl implements IUser {
	boolean patternMatch;
	@Override
	public void firstNameValidation(User user) {
		patternMatch = Pattern.matches("^[A-Z][a-z]{2,}", user.getFirstName());
		if(patternMatch == false) {
			System.out.println("Invalid first name..");
		}else {
			System.out.println("User Name : "+user.getFirstName());
		}
	}
	@Override
	public void lastNameValidation(User user) {
		patternMatch = Pattern.matches("^[A-Z][a-z]{2,}", user.getLastName());
		if(patternMatch == false) {
			System.out.println("Invalid last name..");
		}else {
			System.out.println("User last Name : "+user.getLastName());
		}

	}
	@Override
	public void eMailValidation(User user) {
		patternMatch = Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)+(\\.{0,0})$", user.geteMail());
		if(patternMatch == false) {
			System.out.println("Invalid Email ID..");
		}else {
			System.out.println("User Email ID : "+user.geteMail());
		}
	}
	@Override
	public void phoneNumValidation(User user) {
		patternMatch = Pattern.matches("^[789]\\d{9}$", user.getPhoneNumber());
		if(patternMatch == false) {
			System.out.println("Invalid phone number..");
		}else {
			System.out.println("User Phone Number : "+user.getPhoneNumber());
		}
	}
	@Override
	public void passwordValidation(User user) {
		patternMatch = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]).{8,32}$", user.getPassword());
		if(patternMatch == false) {
			System.out.println("Invalid password..");
		}
	}

}
