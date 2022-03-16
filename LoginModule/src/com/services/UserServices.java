package com.services;

import com.exception.InvalidCredentialsException;
import com.exception.InvalidUserInputException;

public interface UserServices {
	public String Signup(String username, String password, String securityQuestion, String securityAnswer) throws InvalidUserInputException;
	
	public boolean Signin(String username, String password) throws InvalidCredentialsException;
	
	public String forgetPassword(String username, String securityQuestion, String securityAnswer) throws InvalidCredentialsException;
	
	public boolean updatePassword(String username, String password, String updatedPassword) throws InvalidCredentialsException, InvalidUserInputException;
}
