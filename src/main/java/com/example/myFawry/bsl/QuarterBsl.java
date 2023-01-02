package com.example.myFawry.bsl;

import com.example.myFawry.models.Client;
import com.example.myFawry.models.Offer;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Specific;

public class QuarterBsl {
	public int receipt(Service s,Client c,String vc) {
		
		return  250;
	
	}
	public float offer_percent(){
		Offer obj=new Specific();
		((Specific)obj).set_offer(25);
		return obj.getoffer();
	}
}
