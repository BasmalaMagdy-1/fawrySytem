package com.example.myFawry.models;

import com.example.myFawry.controllers.Payment_Controller;

public class Cash extends Payment_behaviour{



public String get_name() {
	return"Cash";
}

Payment_Controller cc;
@Override
public void pay( Payment_behaviour p) {
	cc.pay(p);
}

}