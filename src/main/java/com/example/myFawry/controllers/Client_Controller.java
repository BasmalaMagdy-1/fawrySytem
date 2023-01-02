package com.example.myFawry.controllers;

import java.util.ArrayList;

import com.example.myFawry.models.*;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.myFawry.bsl.ClientBSL;

@RestController
public class Client_Controller {

	
	
	public ClientBSL client_handler;


	public Client_Controller(ClientBSL cbls){
		this.client_handler	= cbls;
	}
	
	 
	 
@PostMapping(value = "/Clientlogins")

public String login(@RequestBody LoginClass c){
	if(client_handler.login(c.getEmail(), c.getPassword()))
		return "Welcome User";
	else
		return "Invalid login";
	
	//return ResponseEntity.status(HttpStatus.CREATED).build();
	
}

@PostMapping(value = "/Client/signup")
public String sign_up(@RequestBody Clientdemo c) {
	    client_handler = new ClientBSL();
		if(client_handler.sign_up(c.getEmail(),c.getUsername(),c.getPassword()))
		{
			return "Regisiter Sucessfully";
		}
		else
		{
			return "Faild Regisiter";
		}
}

@PostMapping(value = "/Client/search")
public Service search_service(@RequestBody Sera name)
{	
	return client_handler.search_service(name.getName());

}

@PostMapping(value="/Client/request_refund")
public String request_refund (@RequestBody refund r) {
	
	return client_handler.request_refund(r);
}
	

}
