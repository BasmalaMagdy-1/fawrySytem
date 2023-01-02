package com.example.myFawry.models;
public abstract class Service_provider {
	int value;
	public abstract String get_name() ;

	public abstract double receipt(Service s,Client c,String vc);
	
	public abstract float offer_percent();
	public void setv (int val) {
		value=val;
		
	}

	

}
