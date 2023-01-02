package com.example.myFawry.models;

import com.example.myFawry.controllers.Payment_Controller;

public class Credit_card extends Payment_behaviour{
	Long ID;
	Long credit_num;
	
	Credit_card(Long num,Long id){
		credit_num=num;
		ID=id;
	}
	public String get_name() {
		  return "Credit_card";
	}
	public Long get_id() {
		return ID;
	}
	public Long getcredit_num() {
		return credit_num;
	}
	
	Payment_Controller cc;
	@Override
	public void pay( Payment_behaviour p) {
		cc.pay(p);
	}
}