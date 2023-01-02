package com.example.myFawry.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class refund {
	int refund_value;
	String client_id;
	public refund(String id,int val)
	{
		client_id=id;
		refund_value=val;
	}
	public int getRefund_value() {
		return refund_value;
	}
	public void setRefund_value(int refund_value) {
		this.refund_value = refund_value;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	
}
