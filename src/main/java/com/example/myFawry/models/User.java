package com.example.myFawry.models;

import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor

public abstract class User {
	protected String email="admin", password="admin";
	//public Vector<User>user_list= new Vector<>(100);

	protected Vector<String>services;
	User(){

	}
	public void set_email (String Email) {
		email=Email;
	}
	public void set_password (String pass) {
		password=pass;
	}
	public String get_email () {
		return email;
	}
	public String get_password () {
		return password;
	}
	abstract public String  login( String email,String password);

	/* public void show_service_options(ArrayList<String>options) {
		 for(int i=0;i<options.size();i++) {
			 System.out.println("Enter "+i+" "+options.get(i));
		 }
	 }*/


}

