package com.client;

import com.exception.InvalidCredentialsException;
import com.exception.InvalidUserInputException;
import com.services.UserServices;
import com.utility.BusinessObjectProvider;

public class Client {
	
	public static void main(String args[]) {	
	
		UserServices user = BusinessObjectProvider.getBusinessObject();
		
		try {
			String username = user.Signup("rupesh", "whoIsrg?@", "What is your nick name?", "rupeee");
			if(user.Signin(username, "whoIsrg?@")) {
				System.out.println("Welcome................................");
			}
			
			String tempPass = user.forgetPassword(username, "What is your nick name?", "rupeee");
			
			if(user.updatePassword(username, tempPass, "rupeshNewPass")) {
				System.out.println("Password Updated");
			}
			
			// using invalid password -> throw error
			user.Signin(username, tempPass);
		}
		catch(InvalidCredentialsException err) {
			err.printStackTrace();
		}
		catch(InvalidUserInputException err) {
			err.printStackTrace();
		}
		catch(Exception err) {
			err.printStackTrace();
		}
	}

}
