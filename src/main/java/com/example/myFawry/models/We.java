package com.example.myFawry.models;

import com.example.myFawry.controllers.ServiceProviderController;

public class We extends Service_provider{

	String phone;
	public double value;
	public int taxes;
	private ServiceProviderController oc;

	
	public void setp(String p) {
		phone =p;
	
	}
	public float offer_percent(){
		return oc.offer_percent(null);
	}
	
	We(){
		System.out.print("You are now on the system WE");
	}
	public void setv(int v) {
		value=v;
	}
	
	public String get_name() {
		return "We";
	}
	@Override
	public double receipt(Service s,Client c,String gg) {
		return oc.receipt(s, c, gg);
		
	
		
	}

		
	
	



	
}
