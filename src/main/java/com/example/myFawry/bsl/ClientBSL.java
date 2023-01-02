package com.example.myFawry.bsl;

import java.util.ArrayList;
import java.util.List;

import com.example.myFawry.models.Client;
import com.example.myFawry.models.Database;
import com.example.myFawry.models.Service;
import com.example.myFawry.models.User;
import com.example.myFawry.models.refund;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientBSL {
		Client cc=new Client();
		//public List<refund> refundList = new ArrayList<>();s
		//Map<String,String>clientList=new HashMap<String, String>();
 //Map<Integer,Integer>refund_list = new HashMap<Integer,Integer>(); //id, refund val


public boolean sign_up(String email, String username, String password) {
	for (Client client1 :Database.getinstance().clientList)
	{
        if(client1.getEmail().equals(email) || client1.getUsername().equals(username))
        {
			System.out.println("Id already exists ");
            return false;
		}
	}
	Database.getinstance().clientList.add(new Client(email,username,password));
	System.out.println("Added Successfully");
	return true;
}


public boolean login(String email, String password) {
	
	for (Client client1 : Database.getinstance().clientList) {
        if(client1.getEmail().equals(email) && client1.getPassword().equals(password))
        {
            return true;
        }
    }
	 return false;

	 }


public Service search_service(String s)
{	
	for(Service res : Database.getinstance().services)
	{
		if(res.name == s)
		{
			return res;
		}
	}
	return null;


}


public String request_refund (refund r) {
	
	Database.getinstance().refundList.add(r);
	String s ="";
	s+="Refund Added Successfully [ ";
	s+= r.getRefund_value();
	s+=" ";
	s+= r. getClient_id();
	s+=" ]";
		return s;
	}

}
