package com.bridgelabz.Regex.common;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.bridgelabz.Regex.entity.User;
import com.bridgelabz.Regex.services.UserRegistrationImpl;

public class UserRegistration {
	static String firstName;
	static String lastName;
	public static void main(String[] args) {
		UserRegistrationImpl obj = new UserRegistrationImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first name : ");
		firstName = scanner.next();
		System.out.println("Enter last name : ");
		lastName = scanner.next();
		obj.firstNameValidation(new User(firstName,lastName));
		obj.lastNameValidation(new User(firstName,lastName));
	}

}
