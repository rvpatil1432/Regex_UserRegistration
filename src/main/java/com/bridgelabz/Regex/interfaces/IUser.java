package com.bridgelabz.Regex.interfaces;

import com.bridgelabz.Regex.entity.User;

public interface IUser {

	public void firstNameValidation(User user);
	public void lastNameValidation(User user);
	public void eMailValidation(User user);
	public void phoneNumValidation(User user);
}
