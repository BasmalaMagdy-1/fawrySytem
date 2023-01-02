package com.example.myFawry.models;

public class Cancer_Hospital extends Service_provider{

public double value;
	
	public void setv(int v) {
		value=v;
	}
	public double getvalue() {
		return value;
	
	}
	public String get_name() {
		return "Cancer_Hospital";
	}
	@Override
	public double receipt(Service s,Client c,String vc) {
		// TODO Auto-generated method stub,
		
		return  value;
	
	}
	public float offer_percent() {
		Offer obj=new Specific();
		((Specific)obj).set_offer(0);
		return obj.getoffer();
	}


}
