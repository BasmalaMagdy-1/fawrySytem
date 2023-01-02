package com.example.myFawry.models;

public abstract class Payment_behaviour {
		
	Service_provider ps;
	String name;
	int r;
	//public Map<Long,Integer>PaymentDB=new HashMap<Long,Integer>(); //user id   credit 
	//Payment_Controller cc;
	
	public void set_r(int rr) {
		r=rr;
	}
	
	public int get_r() {
		return r;
	}
	
	public String get_name() {
		return name;
	}
	
	public void set_name(String n) {
		name=n;
	}
	
	public void set_provider(Service_provider p) {
		ps=p;
	}
	Service_provider get_provider( ) {
		return ps;
	}
	
	//abstract public void pay(Map<Long,Integer>mp,int price);
	abstract public void pay(Payment_behaviour p);


}
