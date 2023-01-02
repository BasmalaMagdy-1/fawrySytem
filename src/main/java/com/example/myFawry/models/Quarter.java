package com.example.myFawry.models;

import com.example.myFawry.controllers.ServiceProviderController;

public class Quarter extends Service_provider{

	ServiceProviderController qc;
	String phone;
	public void setp(String p) {
		phone =p;
	
	}
	Quarter(){
	System.out.print("You are now on the system Quarter ");
	}
	public String get_name() {
		return "Quarter";
	}
	@Override
	public double receipt(Service s,Client c,String vcc) {
		return qc.receipt(s, c,vcc);
	
	}
	public float offer_percent(){
		return qc.offer_percent(null);
	}

	

}
