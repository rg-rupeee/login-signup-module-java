package com.serviceImpl;

import com.bean.User;
import com.exception.InvalidCredentialsException;
import com.exception.InvalidUserInputException;
import com.helper.ValidateUserInput;
import com.services.UserServices;

public class UserServicesImpl implements UserServices {
	User user;
	
	public String Signup(String username, String password, String securityQuestion, String securityAnswer) throws InvalidUserInputException {
		if(!ValidateUserInput.checkUsername(username)) {
			throw new InvalidUserInputException("Please provide a username");
		}
		
		if(!ValidateUserInput.checkPassword(password)) {
			throw new InvalidUserInputException("Please provide a password");
		}
		
		if(!ValidateUserInput.checkPasswordStrength(password)) {
			throw new InvalidUserInputException("Password length should be greater than or equal to 8");
		}
		
		if(!ValidateUserInput.checkUsernamePasswordSame(username, password)) {
			throw new InvalidUserInputException("Password cannot be same as username");
		}
		
		user = new User(username, password, securityQuestion, securityAnswer);
		
		return user.getUsername();
	}
	
	public boolean Signin(String username, String password) throws InvalidCredentialsException {
		if ((UtilUserServicesImpl.validateUsername(user, username)) && (UtilUserServicesImpl.validatePassword(user, password))) {
			return true;
		}
		throw new InvalidCredentialsException("Invalid username or password");
	}
	
	/**
	 * take username, security question and updated password as input
	 * if validated set a temporary system generated password in user.password
	 * returns the temporary password
	 * */
	public String forgetPassword(String username, String securityQuestion, String securityAnswer) throws InvalidCredentialsException {
		if((UtilUserServicesImpl.validateUsername(user, username)) && (UtilUserServicesImpl.validateSecurityQuestionAndAnswer(user, securityQuestion, securityAnswer))) {
			String updatedPassword = UtilUserServicesImpl.getRandomPassword();
			user.setPassword(updatedPassword);
			return updatedPassword;
		}
		
		throw new InvalidCredentialsException("Invalid user details. Username, Security Question and Security Answer does not match");
	}
	
	
	public boolean updatePassword(String username, String password, String updatedPassword) throws InvalidCredentialsException, InvalidUserInputException{
		if((UtilUserServicesImpl.validateUsername(user, username)) && (UtilUserServicesImpl.validatePassword(user, password))) {
			if(!ValidateUserInput.checkPassword(updatedPassword)) {
				throw new InvalidUserInputException("Please provide a password");
			}
			
			if(!ValidateUserInput.checkPasswordStrength(updatedPassword)) {
				throw new InvalidUserInputException("Password length should be greater than or equal to 8");
			}
			
			if(!ValidateUserInput.checkUsernamePasswordSame(username, updatedPassword)) {
				throw new InvalidUserInputException("Password cannot be same as username");
			}
				
			user.setPassword(updatedPassword);
			return true;
		}
		throw new InvalidCredentialsException("Invalid username or password");		
	}
	
}
