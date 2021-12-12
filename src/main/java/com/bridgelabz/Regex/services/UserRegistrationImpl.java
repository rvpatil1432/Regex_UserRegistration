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

}
