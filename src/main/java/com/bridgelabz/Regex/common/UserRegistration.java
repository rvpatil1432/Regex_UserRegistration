package com.bridgelabz.Regex.common;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.bridgelabz.Regex.entity.User;
import com.bridgelabz.Regex.services.UserRegistrationImpl;

public class UserRegistration {
	static String firstName;
	static String lastName;
	static String eMail;
	static String phoneNumber;
	static String password; 
	public static void main(String[] args) {
		UserRegistrationImpl obj = new UserRegistrationImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first name : ");
		firstName = scanner.next();
		System.out.print("Enter last name : ");
		lastName = scanner.next();
		System.out.print("Enter email id : ");
		eMail = scanner.next();
		System.out.print("Enter phone number : ");
		phoneNumber = scanner.next();
		User user = new User(firstName, lastName, eMail,phoneNumber,password);
		obj.firstNameValidation(user);
		obj.lastNameValidation(user);
		obj.eMailValidation(user);
		obj.phoneNumValidation(user);
		obj.passwordValidation(user);
	}

}
