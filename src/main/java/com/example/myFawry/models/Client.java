package com.example.myFawry.models;
import java.util.ArrayList;

import com.example.myFawry.controllers.Client_Controller;

public class Client{

	private Client_Controller cc;
	private  String email;
	private String username;
	private String password;
	static int ID=0;
	int clientId=0;
	float refund=0;

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	 public Client() {
		ID++;
	}
	public Client(String email,String password) {
			setEmail(email);
			setPassword(password);
		}

	public Client(String email, String username, String password) {
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public int get_id() {
		 return ID;
	 }
	 
	public int getClient_id() {
		 return clientId;
		 
	 }
	public void setClient_id(int id)
	{
		clientId=id;
	}

	 
	 public void sign_up(Client c) {
		 Database.getinstance().clientList.add(c);
	 }

	
	public String request_refund (refund r) {
		return cc.request_refund(r);

	}


	

	
}