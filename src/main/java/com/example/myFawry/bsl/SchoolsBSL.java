package com.example.myFawry.bsl;

import com.example.myFawry.models.Client;
import com.example.myFawry.models.Offer;
import com.example.myFawry.models.Schools;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Specific;

public class SchoolsBSL {
	Schools ss;
	public double receipt(Service s, Client c, String vc) {
		// TODO Auto-generated method stub
		
		return  ss.getvalue();
	
	}
	public float offer_percent() {
		Offer obj=new Specific();
		((Specific)obj).set_offer(0);
		return obj.getoffer();
	}
}
