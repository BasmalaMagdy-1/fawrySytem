package com.example.myFawry.bsl;

import com.example.myFawry.models.Client;
import com.example.myFawry.models.Offer;
import com.example.myFawry.models.Orange;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Specific;

public class OrangeBsl {
	Orange o;
	public float offer_percent(){
		Offer obj=new Specific();
		((Specific)obj).set_offer(40);
		return obj.getoffer();
	}
	public int receipt(Service s,Client c,String vc) {
		if(s.get_name()=="Mobile_recharge") {
		
			o.setTaxes((int) (o.getvalue()*1.3) ) ;
		}
		else if(s.get_name()=="Internet_Payment") {

			o.setTaxes(150);
		}
		return o.getTaxes() ;
		

}
}
