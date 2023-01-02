package com.example.myFawry.models;

import com.example.myFawry.controllers.Payment_Controller;

public class Wallet extends Payment_behaviour{
	Long ID;
	
	  public String get_name() {
		  return "Wallet";
	  }

	
	public Long get_id() {
		return ID;
	}
	
	Wallet(Long id){
		ID= id;
	}
	public Wallet(){
		
	}
	
	
	Payment_Controller cc;
	@Override
	public void pay( Payment_behaviour p) {
		cc.pay(p);
	}
	
}
	
	




	
	
	
		
		
	
	

