package com.karthik.springbootone.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("karthik") && password.equalsIgnoreCase("password");
	}
}
