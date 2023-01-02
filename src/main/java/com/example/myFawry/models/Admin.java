package com.example.myFawry.models;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.example.myFawry.controllers.Client_Controller;

public class Admin extends User{

	
	private Client_Controller cc;

	@Override
	public String login( String email,String password)
	 {
		 LoginClass c = new LoginClass();
		 c.setEmail(email);
		 c.setPassword(password);
		 return cc.login(c);
	 }
	
	//getAllRefunds
	
	//AC_Reject
	
}

