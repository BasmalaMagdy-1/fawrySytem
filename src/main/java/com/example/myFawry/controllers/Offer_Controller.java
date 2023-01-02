package com.example.myFawry.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myFawry.bsl.OfferBSL;
import com.example.myFawry.models.Offer;

@RestController
public class Offer_Controller {

	OfferBSL offer_bsl;
	
	 @PostMapping(value = "/offer")
	public Offer choose_offer(@RequestBody Offer offer)   ///********* Param
	{
		return offer_bsl.choose_offer(offer);
	}
}
