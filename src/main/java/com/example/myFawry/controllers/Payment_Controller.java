package com.example.myFawry.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myFawry.models.Payment_behaviour;
import com.example.myFawry.models.Wallet;

@RestController
public class Payment_Controller {

	@PostMapping(value = "/pay")
	public void pay(@RequestBody Payment_behaviour p)
	{
		//p.pay(p.PaymentDB, p.get_r());
		if(p.get_name()=="Wallet"){
			p=new Wallet();	
		}else if(p.get_name()=="Credit_card")
		p.pay(p);
	}
}
