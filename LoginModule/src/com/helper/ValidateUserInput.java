package com.helper;

public class ValidateUserInput {
	static public boolean checkUsername(String username) {
		return ((username != null) && (username != ""));
	}
	
	static public boolean checkPassword(String password) {
		return ((password != null) && (password != "")); 
	}
	
	static public boolean checkPasswordStrength(String password) {
		return (password.length() >= 8);
	}
	
	static public boolean checkUsernamePasswordSame(String username, String password) {
		return (username != password);
	}
}
