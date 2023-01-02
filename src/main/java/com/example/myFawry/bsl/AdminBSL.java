package com.example.myFawry.bsl;

import java.util.List;
import java.util.Map;

import com.example.myFawry.models.Admin;
import com.example.myFawry.models.Client;
import com.example.myFawry.models.Database;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminBSL {
	
	 //List<Admin> adminList = new ArrayList<>();
	 //List<refund> refundList = new ArrayList<>();
	
	Admin admin;
	ClientBSL client_bsl;
	Client client;
	Database d;

	public boolean login(String email, String password) {
			
		  if(admin.get_email() == "admin" && admin.get_password()=="admin")
		  {
		       return true;
		  }
		    
		   
			 return false;

			 }
	
	 //Scanner INPUT = new Scanner(System.in);
	
	public List getAllRefunds() {
		return d.refundList;
		
	}
	
	public String AC_REJ(int value,Long id,int T_F) {
		
		   	if(T_F==1) {
		       
		     	int pp=d.wallet.get(id);
		      	d.wallet.put(id, pp+value);
		      	return "Money added Successfully";
		       			
		    }
		    else {
		       	return"Rejected";
		    }
		       		
		     			
	}
		
	
}
