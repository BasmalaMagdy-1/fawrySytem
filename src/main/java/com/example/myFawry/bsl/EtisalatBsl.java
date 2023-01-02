package com.example.myFawry.bsl;

import com.example.myFawry.models.Client;
import com.example.myFawry.models.Etisalat;
import com.example.myFawry.models.Offer;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Specific;

public class EtisalatBsl {
	Etisalat e;
	
	public float offer_percent(){
		Offer obj=new Specific();
		((Specific)obj).set_offer(20);
		return obj.getoffer();
	}
	public double receipt(Service s, Client c, String vc) {
		
		if(s.get_name()=="Mobile_recharge") {
		
			e.setTaxes((int) (e.getvalue()*1.1)) ;
		}
		else if(s.get_name()=="Internet_Payment") {

			e.setTaxes(170);
		}
		return e.getTaxes() ;
		
	
		
	}

}
