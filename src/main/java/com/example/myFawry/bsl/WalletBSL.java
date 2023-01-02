package com.example.myFawry.bsl;

import java.util.HashMap;
import java.util.Map;

import com.example.myFawry.models.Payment_behaviour;
import com.example.myFawry.models.Wallet;

public class WalletBSL {
	public Map<Long,Integer>WalletDB=new HashMap<Long,Integer>(); //user id   credit 
	
	
	public String add(Long user_id,int credit) {
	       
		WalletDB.put(user_id, credit);
        return "Wallet info is Added Successfully";
    }
	
	
	Wallet w;
	
	public String pay(Payment_behaviour p) {
		
		String s = null;
		if(WalletDB.get(w.get_id())!=null) {
		int pp=WalletDB.get(w.get_id());
		if(p.get_r()<=pp) {
			//System.out.print("y"+p);
			WalletDB.put((long) w.get_id(),pp-p.get_r());
			
			s="your tranction has been completed";
			
			//System.out.print("your money is : ");
			//System.out.println (WalletDB.get(w.get_id()));

		}
		else {
			//System.out.print("Not enough money in your wallet");
			s ="Not enough money in your wallet";
		}
	
	}
		return s;

}
}