package com.in28minutes;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		if(user.equalsIgnoreCase("Pankaj") && password.equals("dummy"))
			return true;
		return false;
	}

}
