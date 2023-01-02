package com.example.myFawry.controllers;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.myFawry.bsl.AdminBSL;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin_controller {

	public AdminBSL admin_bsl;
	
	public Admin_controller(AdminBSL absl) {
        this.admin_bsl = absl;
   }
	
	@PostMapping(value = "/Adminlogin")
	public boolean login(@RequestParam("email") String email,@RequestParam("password")String password){
		
		return admin_bsl.login(email, password);
		
	}
	
	@GetMapping(value = "/Admin/GetAllRefunds")
	public List getAllRefunds() {
		return admin_bsl.getAllRefunds();
		
	}
	
	@PostMapping(value="/Client/AC_REJ")
	public String AC_REJ(int value,Long id,int T_F) {
		
		return admin_bsl.AC_REJ( value, id, T_F);
		       		
		     			
	}
}
