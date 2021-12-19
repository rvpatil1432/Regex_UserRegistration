package com.bridgelabz.Regex;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabz.Regex.entity.User;
import com.bridgelabz.Regex.services.UserRegistrationImpl;

public class UserRegistrationTest {
	boolean result;
	UserRegistrationImpl obj = new UserRegistrationImpl();;
	User user1 = new User("Rohini", "Telang", "rvpatil1432@gmail.com", "9373936578", "Rohinitelang123");
	User user2 = new User("rohini", "telang", "rvpatil1432", "937393657834", "Roh123");
	
	@Test
	public void firstNameValidationHappy() {
		result = obj.firstNameValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void firstNameValidationSad() {
		result = obj.firstNameValidation(user2);
		assertEquals(true, result);
	}
	@Test
	public void lastNameValidationHappy() {
		result = obj.lastNameValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void lastNameValidationSad() {
		result = obj.lastNameValidation(user2);
		assertEquals(true, result);
	}
	@Test
	public void eMailValidationHappy() {
	//	result = obj.eMailValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void eMailValidationSad() {
	//	result = obj.eMailValidation(user2);
		assertEquals(true, result);
	}
	@Test
	public void phoneNumValidationHappy() {
		result = obj.phoneNumValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void phoneNumValidationSad() {
		result = obj.phoneNumValidation(user2);
		assertEquals(true, result);
	}
	@Test
	public void passwordValidationHappy() {
		result = obj.passwordValidation(user1);
		assertEquals(true, result);
	}
	@Test
	public void passwordValidationSad() {
		result = obj.passwordValidation(user2);
		assertEquals(true, result);
	}
}
