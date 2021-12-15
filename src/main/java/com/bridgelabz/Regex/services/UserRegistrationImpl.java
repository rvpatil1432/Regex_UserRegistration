package com.bridgelabz.Regex.services;

import java.util.regex.Pattern;

import com.bridgelabz.Regex.entity.User;
import com.bridgelabz.Regex.interfaces.IUser;

public class UserRegistrationImpl implements IUser {
	boolean patternMatch;
	@Override
	public boolean firstNameValidation(User user) {
		patternMatch = Pattern.matches("^[A-Z][a-z]{2,}", user.getFirstName());
		return patternMatch;
	}
	@Override
	public boolean lastNameValidation(User user) {
		patternMatch = Pattern.matches("^[A-Z][a-z]{2,}", user.getLastName());
		return patternMatch;

	}
	@Override
	public boolean eMailValidation(User user) {
		patternMatch = Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)+(\\.{0,0})$", user.geteMail());
		return patternMatch;
	}
	@Override
	public boolean phoneNumValidation(User user) {
		patternMatch = Pattern.matches("^[789]\\d{9}$", user.getPhoneNumber());
		return patternMatch;
	}
	@Override
	public boolean passwordValidation(User user) {
		patternMatch = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]).{8,32}$", user.getPassword());
		return patternMatch;
	}

}
