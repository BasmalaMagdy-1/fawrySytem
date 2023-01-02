package com.example.myFawry.models;
public abstract class Service {
public String name;
 
public abstract void setid(Long id);

public abstract String  get_name();

abstract Payment_behaviour create(Service s,Service_provider p,Payment_behaviour pay_behave,Client c);



}
