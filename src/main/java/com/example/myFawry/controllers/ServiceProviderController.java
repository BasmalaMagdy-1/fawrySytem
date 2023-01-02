package com.example.myFawry.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myFawry.bsl.Cancer_HospitalBsl;
import com.example.myFawry.bsl.EtisalatBsl;
import com.example.myFawry.bsl.MonthlyBsl;
import com.example.myFawry.bsl.NGOsBsl;
import com.example.myFawry.bsl.OrangeBsl;
import com.example.myFawry.bsl.QuarterBsl;
import com.example.myFawry.bsl.SchoolsBSL;
import com.example.myFawry.bsl.VodafoneBsl;
import com.example.myFawry.models.Client;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Service_provider;

@RestController
public class ServiceProviderController {
	public VodafoneBsl Vodafone_handler;
	public MonthlyBsl MonthlyHandler;
	public SchoolsBSL SchoolsHandler;
	public OrangeBsl Orange_handler;
	public NGOsBsl NGOs_handler;
	public QuarterBsl Quarter_handler;
	public EtisalatBsl  Etisalat_Handler;
	public Cancer_HospitalBsl Canser_Handler;
	
	@PostMapping(value = "/service_provider/offer_percent")

	public float offer_percent(@RequestBody Service_provider sss){
		if(sss.get_name()=="Etisalat") {
			return Etisalat_Handler.offer_percent();
		}
		else if(sss.get_name()=="Orange")
			return Orange_handler.offer_percent();
		else if(sss.get_name()=="Monthly")
			return MonthlyHandler.offer_percent();
		else if(sss.get_name()=="Schools")
			return SchoolsHandler.offer_percent();
		else if(sss.get_name()=="Vodafone")
			return Vodafone_handler.offer_percent();
		else if(sss.get_name()=="Etisalat")
			return Etisalat_Handler.offer_percent();
		else if(sss.get_name()=="NGOs")
			return NGOs_handler.offer_percent();
		else if(sss.get_name()=="Canser")
			return Canser_Handler.offer_percent();
		else if (sss.get_name()=="Quarter")
			return Quarter_handler.offer_percent();
		return 0;



	}
	@PostMapping(value = "/service_provider/receipt")

		public double receipt(@RequestBody Service s,@RequestBody Client c, String vc) {

		if(vc=="Etisalat") {
			return Etisalat_Handler.receipt(s,c,vc);
		}
		else if(vc=="Orange")
			return Orange_handler.receipt(s,c,vc);
		else if(vc=="Monthly")
			return MonthlyHandler.receipt(s,c,vc);
		else if(vc=="Schools")
			return SchoolsHandler.receipt(s,c,vc);
		else if(vc=="Vodafone")
			return Vodafone_handler.receipt(s,c,vc);
		else if(vc=="Etisalat")
			return Etisalat_Handler.receipt(s,c,vc);
		else if(vc=="NGOs")
			return NGOs_handler.receipt(s,c,vc);
		else if(vc=="Canser")
			return Canser_Handler.receipt(s,c,vc);
		else if (vc=="Quarter")
			return Quarter_handler.receipt(s,c,vc);
		return 0;

		
	}
	}

