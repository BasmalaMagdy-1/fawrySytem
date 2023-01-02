package com.example.myFawry.models;
import java.util.Scanner;

import com.example.myFawry.controllers.Service_Controller;


public class Landline extends Service{
	
	Long id;
	Service_Controller service;

	public  void setid(Long id) {
		this.id=id;
	};


	public Long getid() {
		return id;
	}
	
	public Landline(){
		name="Landline";
	}
	public String get_name() {
		return "Landline";
	}
	
public Payment_behaviour rechageProccess(Service s,Service_provider p,Payment_behaviour pay_behave,Client c) {
		
		return service.rechageProccess(s,p,pay_behave,c);

	}
	
	public Payment_behaviour create(Service s,Service_provider ss,Payment_behaviour pay_behave,Client c) {
		 
		return service.create(s,ss, pay_behave,c);
	 }

	
}
