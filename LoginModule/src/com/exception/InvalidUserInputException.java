package com.exception;

public class InvalidUserInputException extends Exception {
	private String err;
	
	public InvalidUserInputException() {
		super("Invalid User Input Provided");
		this.err = "Invalid User Input Provided";
	}
	
	public InvalidUserInputException(String err) {
		super(err);
		this.err = err;
	}
	
	public String toString() {
		return this.err;
	}
}
