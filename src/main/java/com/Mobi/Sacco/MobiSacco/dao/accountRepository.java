package com.Mobi.Sacco.MobiSacco.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Mobi.Sacco.MobiSacco.Model.Account;

public interface accountRepository extends CrudRepository<Account, String>{
	List<Account> findByCellPhone(String cellPhone);
}
