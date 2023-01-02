package com.example.myFawry.models;
import java.util.Scanner;

import com.example.myFawry.controllers.Service_Controller;


public class Donation extends Service {
	private String name;
	Service_Controller service;
	
	Long id;
	public  void setid(Long id) {
		this.id=id;
	}

	public Long getid() {
		return id;
	}
	public String get_name() {
		return "Donation";
	}
	public Donation(){
		name="Donation";
	}

	
	public Payment_behaviour rechageProccess(Service s,Service_provider p,Payment_behaviour pay_behave,Client c) {
		
		return service.rechageProccess(s,p,pay_behave,c);
	}
	Payment_behaviour create(Service s,Service_provider p,Payment_behaviour pay_behave,Client c)
	 {
		return service.create(s,p, pay_behave,c);
	 }

	

	
}
