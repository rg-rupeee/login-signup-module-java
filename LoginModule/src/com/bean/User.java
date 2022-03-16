package com.bean;

public class User {
	private String username;
	private String password;
	private String securityQuestion;
	private String securityAnswer;
	
	public User(String username, String password, String securityQuestion, String securityAnswer) {
		this.username = username;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getSecurityQuestion() {
		return this.securityQuestion;
	}
	
	public String getSecurityAnswer() {
		return this.securityAnswer;
	}
	
	public String setUsername(String username) {
		this.username = username;
		return this.username;
	}
	
	public String setPassword(String password) {
		this.password = password;
		return this.password;
	}
	
	public String setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
		return this.securityQuestion;
	}
	
	public String setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
		return this.securityAnswer;
	}
	
	public String toString() {
		String details = "Username: "+this.username+" Password: "+this.password+" Security Question: "+this.securityQuestion+" Security Answer: "+this.securityAnswer;
		return details;
	}
}
