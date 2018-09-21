package com.Mobi.Sacco.MobiSacco.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mobi.Sacco.MobiSacco.dao.accountRepository;
import com.Mobi.Sacco.MobiSacco.Model.Account;

@Service
public class accountService {
	@Autowired
	private final accountRepository accountRepo;
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public accountService(accountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}
	
	public List<Account> getAccountDetails(String cellPhone){
		List<Account> Account = new ArrayList<>();
		for(Account account : accountRepo.findByCellPhone(cellPhone)){
			Account.add(account);
        }
		
		return Account;
		
	}
	
	public boolean validatePin(String accNo, String cellPhone, String pin) {
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("ReceiveP_DP"); 

        //Declare the parameters in the same order
        query.registerStoredProcedureParameter(1, Integer.class, ParameterMode.OUT);
        query.registerStoredProcedureParameter(2, Integer.class, ParameterMode.OUT);
        query.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);

        //Pass the parameter values
        query.setParameter(3, accNo);
        query.setParameter(4, cellPhone);
        query.setParameter(5, pin);

        //Execute query
        query.execute();

        //Get output parameters
        Integer res = (Integer) query.getOutputParameterValue(1);
        Integer result = (Integer) query.getOutputParameterValue(2);

        return result == 1;
	}
	
}
