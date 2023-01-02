package com.example.myFawry.models;

import com.example.myFawry.controllers.ServiceProviderController;

public class Etisalat extends Service_provider {
	
	ServiceProviderController ec;
	String phone;
	public double value;
	public int taxes;
	public void setTaxes(int p) {
		taxes=p;
	
	}
	public int getTaxes() {
		return taxes;
	
	}
	public void setp(String p) {
		phone =p;
	
	}
	public void setv(int v) {
		value=v;
	}
	public String get_name() {
		return "Etisalat";
	}
	public double getvalue() {
		return value;
	
	}
	public float offer_percent(){
		
		return ec.offer_percent(null);
	}
	@Override
	public double receipt(Service s,Client c,String ss) {
		
		
		return ec.receipt(s, c,ss) ;
		
	
		
	}

}
