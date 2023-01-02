package com.example.myFawry.bsl;

import com.example.myFawry.models.Client;
import com.example.myFawry.models.Offer;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Specific;
import com.example.myFawry.models.Vodafone;

public class VodafoneBsl {
	Vodafone v;

public float offer_percent(){
	Offer obj=new Specific();
	((Specific)obj).set_offer(30);
	return obj.getoffer();
}


public int receipt(Service s, Client c, String vc) {
	if(s.get_name()=="Mobile_recharge") {
	
		v.setTaxes((int) (v.getvalue()*1.1)) ;
	}
	else if(s.get_name()=="Internet_Payment") {

		v.setTaxes(100);
	}
	return v.getTaxes() ;
	

	
}
}
