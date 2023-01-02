package com.example.myFawry.models;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Database {
	static Database instance;
	public ArrayList<Service> services = new ArrayList<Service>();
	private Database() {
		// TODO Auto-generated constructor stub
	}
	 public ArrayList<Client> clientList = new ArrayList<>();	 
	 public ArrayList<refund> refundList = new ArrayList<>();
	 public Map<Long,Integer>wallet;

	 public static Database getinstance()
	 {
		 if(instance == null)
		 {
			 instance = new Database();
			 Service s = new Mobile_recharge();
			 Service s2 = new Donation();
			 Service s3 = new Landline();
			 Service s4 = new Internet_Payment();
			 instance.services.add(s);
			 instance.services.add(s2);
			 instance.services.add(s3);
			 instance.services.add(s4);

		 }
		 return instance;
	 }

	 void  fillusers()
	 {
		 Client u=new Client("Basmala","2322652");
		 Client uu=new Client("israa","262161");
		 Client uuu=new Client("fatma","15165363");
	 	clientList.add((Client) u);
	 	clientList.add((Client) uu);
	 	clientList.add((Client) uuu);


	 }
	 void  fillrefund()
	 {
	 	refund r=new refund("2322652",3153);
	 	refund rf=new refund("262161",1635);
	 	refund ref=new refund("15165363",64516);
	 	refundList.add(r);
	 	refundList.add(ref);
	 	refundList.add(rf);


	 }
	 void  fillwallet()
	 {
	 	wallet.put((long) 1,2322652);
	 	wallet.put((long) 2,262161);
	 	wallet.put((long) 3,15165363);

	 }
	 

}
