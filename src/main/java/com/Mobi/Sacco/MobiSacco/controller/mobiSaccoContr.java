package com.Mobi.Sacco.MobiSacco.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mobi.Sacco.MobiSacco.service.accountService;
import com.Mobi.Sacco.MobiSacco.Model.Account;

@RestController
public class mobiSaccoContr {
	@Autowired
	public accountService accountServ;
	
	@RequestMapping(value="/account/{cellPhone}")
	public List<Account> getAccountDetails(@PathVariable String cellPhone){
		List<Account> Account = new ArrayList<>();
		Account = accountServ.getAccountDetails(cellPhone);
		return Account;
	}
	
	@RequestMapping("/validatePin")
	public boolean validatePin(
	  @RequestParam(value = "accNo") String accNo,
	  @RequestParam(value = "cellPhone") String cellPhone,
	  @RequestParam(value = "pin") String pin) {
		return true; //accountServ.validatePin(accNo, cellPhone, pin);
	}
}
