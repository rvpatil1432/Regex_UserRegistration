package com.bridgelabz.Regex.services;

import java.util.regex.Pattern;

import com.bridgelabz.Regex.common.EmailInvalidException;
import com.bridgelabz.Regex.common.FirstNameInvalidException;
import com.bridgelabz.Regex.common.LastNameInvalidException;
import com.bridgelabz.Regex.common.MobileNumberInvalidEXception;
import com.bridgelabz.Regex.common.PasswordInvalidException;
import com.bridgelabz.Regex.entity.User;
import com.bridgelabz.Regex.interfaces.IUser;

public class UserRegistrationImpl implements IUser {
	boolean patternMatch;
	@Override
	public boolean firstNameValidation(User user) {
		try {
			patternMatch = Pattern.matches("^[A-Z][a-z]{2,}", user.getFirstName());
			if(patternMatch == false) {
				throw new FirstNameInvalidException("Invalid First Name.."); //throwing custom exception
			}
		}
		catch(FirstNameInvalidException ex) {
			System.out.println(ex.getMessage());
		}
		return patternMatch;
	}
	@Override
	public boolean lastNameValidation(User user) {
		try {
			patternMatch = Pattern.matches("^[A-Z][a-z]{2,}", user.getLastName());
			if(patternMatch == false) {
				throw new LastNameInvalidException("Invalid Last Name.."); //throwing custom exception
			}
		}catch(LastNameInvalidException ex) {
			System.out.println(ex.getMessage());
		}	
		return patternMatch;

	}
	@Override
	//public boolean eMailValidation(User user) {
	public boolean eMailValidation(String eMails) {
		try {
			patternMatch = Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)+(\\.{0,0})$", eMails);
			if(patternMatch == false) {
				throw new EmailInvalidException("Invalid Email ID..");//throwing custom exception
			}
		}catch(EmailInvalidException ex) {
			System.out.println(ex.getMessage());
		}	
		return patternMatch;
	}
	@Override
	public boolean phoneNumValidation(User user) {
		try {
			patternMatch = Pattern.matches("^[789]\\d{9}$", user.getPhoneNumber());
			if(patternMatch == false) {
				throw new MobileNumberInvalidEXception("Invalid Mobile Number..");//throwing custom exception
			}
		}catch(MobileNumberInvalidEXception ex) {
			System.out.println(ex.getMessage());
		}	

		return patternMatch;
	}
	@Override
	public boolean passwordValidation(User user) {
		try {
		patternMatch = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?&])([a-zA-Z0-9@$!%*?&]{8,})$", user.getPassword());
		if(patternMatch == false) {
			throw new PasswordInvalidException("Invalid Password..");//throwing custom exception
		}
	}catch(PasswordInvalidException ex) {
		System.out.println(ex.getMessage());
	}	
		return patternMatch;
	}

}
