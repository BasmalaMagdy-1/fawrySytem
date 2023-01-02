package com.example.myFawry.models;


import com.example.myFawry.controllers.ServiceProviderController;


public class Monthly extends Service_provider{
	private ServiceProviderController vc;

	String phone;
	public void setp(String p) {
		phone =p;
	
	}

	public String get_name() {
		return "Monthly";
	}
	@Override
	public double receipt(Service s,Client c,String vcc) {
		return vc.receipt(s,c,vcc);
	
	}
	public float offer_percent(){
		return vc.offer_percent(null);
	}

	
	

}
