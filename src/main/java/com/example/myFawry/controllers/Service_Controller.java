package com.example.myFawry.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myFawry.bsl.SeviceBSL;
import com.example.myFawry.models.Client;
import com.example.myFawry.models.Payment_behaviour;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Service_provider;
@RestController
public class Service_Controller {
   SeviceBSL servicehandler;
	public Service_Controller() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping(value = "/service/rechargeProcess")
	public Payment_behaviour rechageProccess(@RequestParam("s")Service s,@RequestParam("p")Service_provider p,@RequestParam("pay_behave")Payment_behaviour pay_behave,@RequestParam("c")Client c) {
		return servicehandler.rechageProccess(s,p,pay_behave,c);
	}
	@PostMapping(value = "/service/create")
	public Payment_behaviour create(@RequestParam("s")Service s,@RequestParam("ss")Service_provider ss,@RequestParam("pay_behave")Payment_behaviour pay_behave,@RequestParam("c")Client c)
	{
		return servicehandler.create(s,ss,pay_behave,c);
	}

}
