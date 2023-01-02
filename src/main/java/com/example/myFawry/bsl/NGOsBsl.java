package com.example.myFawry.bsl;

import com.example.myFawry.models.NGOs;
import com.example.myFawry.models.Client;
import com.example.myFawry.models.Offer;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Specific;

public class NGOsBsl {
	NGOs n;
	public float offer_percent() {
		Offer obj=new Specific();
		((Specific)obj).set_offer(0);
		return obj.getoffer();
	}
	
	public double receipt(Service s,Client c,String vc) {
		// TODO Auto-generated method stub
		
		return   n.getvalue();
	
	}
}
