package com.example.myFawry.bsl;

import java.util.Scanner;

import com.example.myFawry.models.Client;
import com.example.myFawry.models.Payment_behaviour;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.Service_provider;


public class SeviceBSL {
    CreditCardBSL credit;
	public SeviceBSL() {
		// TODO Auto-generated constructor stub
	}
	
	public Payment_behaviour rechageProccess(Service s,Service_provider p,Payment_behaviour pay_behave,Client c ) {
		/*String name=p.get_name();
		 int r = (int) p.receipt(s,c,name);
		 long ID;
		if(s==new Donation()) {
		 ID=((Donation) s).getid();
		}
		else if(s==new Internet_Payment()) {
			 ID=((Internet_Payment) s).getid();
			
		}
		else if(s==new Landline()) {
			 ID=((Landline) s).getid();
		}
		else if(s==new Mobile_recharge()) {
			 ID=((Mobile_recharge) s).getid();
		}
		 long cardNum=credit.CreditCardDB.get(ID);

		 if(pay_behave==new Wallet(ID)) {
			pay_behave = new Wallet(ID);
			pay_behave.set_r(r);
		 }
		 if(pay_behave==new Credit_card(cardNum,ID)) {
			pay_behave = new Credit_card(cardNum,ID);
			pay_behave.set_r(r);
		 }
		}
		*/
		String name=p.get_name();
		 int r = (int) p.receipt(s,c,name);
	     pay_behave.set_r(r);
		return pay_behave;
		
	}
	
	
	public Payment_behaviour create(Service s,Service_provider ss,Payment_behaviour pay_behave,Client c)
	 {
		
		 Payment_behaviour pp=null;
	     rechageProccess(s,ss,pay_behave, c);
		 pp.set_provider(ss);

		return pp;
	 }
	}


