package com.serviceImpl;

import com.bean.User;

public class UtilUserServicesImpl {
	public static boolean validateUsername(User user, String username) {
		return (user.getUsername() == username);
	}
	
	public static boolean validatePassword(User user, String password) {
		return (user.getPassword() == password);
	}
	
	public static boolean validateSecurityQuestionAndAnswer(User user, String question, String answer) {
		return ((user.getSecurityQuestion() == question) && (user.getSecurityAnswer() == answer));
	}
	
	public static String getRandomPassword() {
		return "aldksfj23893203@@!@232daksdfkfdfk00==";
	}
	
}
