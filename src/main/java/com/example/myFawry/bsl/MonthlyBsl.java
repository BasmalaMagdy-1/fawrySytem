package com.example.myFawry.bsl;

import com.example.myFawry.models.Client;
import com.example.myFawry.models.Offer;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Specific;

public class MonthlyBsl {
	public int receipt(Service s, Client c, String vc) {
		// TODO Auto-generated method stub
		
		return  5;
	
	}
	public float offer_percent(){
		Offer obj=new Specific();
		((Specific)obj).set_offer(50);
		return obj.getoffer();
	}
}
