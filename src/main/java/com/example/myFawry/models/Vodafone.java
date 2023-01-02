package com.example.myFawry.models;

import com.example.myFawry.controllers.ServiceProviderController;

public class Vodafone extends Service_provider{
	private ServiceProviderController vc;
	String phone;
	public double value;
	public int taxes;
	
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
		return taxes;
	
	}
	public String get_name() {
		return "Vodafone";
	}
	public float offer_percent(){
		return vc.offer_percent(null);
	}

	
	public double receipt(Service s,Client c,String h) {
	
		return vc.receipt(s, c,h);
		
	
		
	}
	
	
}
