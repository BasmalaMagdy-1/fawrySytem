package com.example.myFawry.models;

import com.example.myFawry.controllers.ServiceProviderController;

public class NGOs extends Service_provider {

	private ServiceProviderController nc;
public double value;
	
	public void setv(double v) {
		value=v;
	}
	public String get_name() {
		return "NGOs";
	}
	NGOs(){
		System.out.print("You are now on the system NGOs");

	}
	public double getvalue() {
		return value;
	
	}
	public float offer_percent() {
		
		return nc.offer_percent(null);
	}
	@Override
	public double receipt(Service s,Client c,String ccc) {
		
		return  nc.receipt(s, c,ccc);
	
	}
	

}
