package com.example.myFawry.bsl;

import java.util.HashMap;
import java.util.Map;

import com.example.myFawry.models.Credit_card;
import com.example.myFawry.models.Payment_behaviour;

public class CreditCardBSL {

	public Map<Long,Integer>CreditCardDB=new HashMap<Long,Integer>(); //user id   credit 
	
	
	public String add(Long user_id,int credit) {
       
		CreditCardDB.put(user_id, credit);
        return "Credit Card is Added Successfully";
    }
	
	
	public boolean valid_credit_card(Map<Long,Integer>user_card,int price) {
		Long rkm=c.getcredit_num();
		if(user_card.get(c.get_id())==null) {
			System.out.print("Invalid user ");
			return false;	
	
		}
	else {
	if(rkm <=100000000 &&price<=user_card.get(c.get_id())) {
		
		return true;
		
	}
	return false;	
	}
	}
	
	Credit_card c;

		public String pay (Payment_behaviour p) {
			if(valid_credit_card(CreditCardDB,c.get_r())) {
		
				CreditCardDB.put(c.get_id(),CreditCardDB.get(c.get_id())-c.get_r());
				
				String s="your tranction has been completed";
				return s;
				
				//System.out.println("your money is : ");
		
				//System.out.println (CreditCardDB.get(c.get_id()));
			}
			else {
				//System.out.println("Invalid transection your money is : "+CreditCardDB.get(c.get_id()));
		
				return"Not enough money in your wallet";
			}
		
		}


/*public void pay(Map<Long,Integer>user_card,int price) {
	if(valid_credit_card(user_card,price)) {

		user_card.put(c.get_id(),user_card.get(c.get_id())-price);
		System.out.println("your money is : ");

		System.out.println (user_card.get(c.get_id()));
	}
	else {
		System.out.println("Invalid transection your money is : "+user_card.get(c.get_id()));

	}

}*/
}
