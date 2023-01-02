package com.example.myFawry.models;

import com.example.myFawry.controllers.ServiceProviderController;

public class Schools extends Service_provider{
	ServiceProviderController ssc;

	
	public double value;
	public String get_name() {
		return "Schools";
	}
	
	public void setv(int v) {
		value=v;
	}
	public double getvalue() {
		return value;
	}
	@Override
	public double receipt(Service s,Client c,String ss) {
		// TODO Auto-generated method stub
		
		return  ssc.receipt(s, c,ss);
	
	}
	public float offer_percent() {
		return ssc.offer_percent(null);
	}




}
