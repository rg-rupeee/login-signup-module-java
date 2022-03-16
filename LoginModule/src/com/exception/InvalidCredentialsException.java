package com.exception;

public class InvalidCredentialsException extends Exception{
	private String err;
	
	public InvalidCredentialsException() {
		super("Invalid Credentials provided");
		this.err = "Invalid Credentials provided";
	}
	
	public InvalidCredentialsException(String err) {
		super(err);
		this.err = err;
	}
	
	public String toString() {
		return this.err;
	}
}
