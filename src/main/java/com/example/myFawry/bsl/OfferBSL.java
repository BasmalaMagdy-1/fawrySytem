package com.example.myFawry.bsl;

import com.example.myFawry.models.Offer;
import com.example.myFawry.models.Overall;
import com.example.myFawry.models.Specific;

public class OfferBSL {

	public Offer choose_offer(Offer offer)   ///*********
	{
		if(offer.offer_name()=="Specific")
		{
			Offer S = new Specific();
			
			return S;
		}else {
			Offer O = new Overall();
			return O;
		}
	}

}
