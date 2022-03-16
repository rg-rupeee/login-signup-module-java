package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

import com.services.UserServices;

public class BusinessObjectProvider {
	static String classname;
	
	public static void ReadRepository() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(".//resources//info.properties");
			Properties p = new Properties();
			p.load(fis);
			classname = p.getProperty("businessclass");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static UserServices getBusinessObject() {
		UserServices u = null;
		
		ReadRepository();
		
		try {
			ReadRepository();
			u = (UserServices) Class.forName(classname).getDeclaredConstructor().newInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return u;
	}

}
