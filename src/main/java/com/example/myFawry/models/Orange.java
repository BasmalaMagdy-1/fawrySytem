package com.example.myFawry.models;

import com.example.myFawry.controllers.ServiceProviderController;

public class Orange extends Service_provider {
	private ServiceProviderController oc;
	

	String phone;
	public double value;
	public int taxes;
	
	Orange(){
		System.out.print("You are now on the system Orange");

	}
	public void setp(String p) {
		phone =p;
	
	}
	public void setTaxes(int p) {
		taxes=p;
	
	}
	public int getTaxes() {
		return taxes;
	
	}
	
	
	public void setv(int v) {
		value=v;
	}
	public double getvalue() {
		return value;
	
	}
	public String get_name() {
		return "Orange";
	}
	@Override
	public float offer_percent(){
		return oc.offer_percent(null);
	}
	
	public double receipt(Service s,Client c,String sss) {
		
		return oc.receipt(s, c,sss); 
		
	
		
	}

}
