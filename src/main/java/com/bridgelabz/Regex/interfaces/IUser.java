package com.bridgelabz.Regex.interfaces;

import com.bridgelabz.Regex.entity.User;

public interface IUser {

	public boolean firstNameValidation(User user);
	public boolean lastNameValidation(User user);
	public boolean eMailValidation(User user);
	public boolean phoneNumValidation(User user);
	public boolean passwordValidation(User user);
}
