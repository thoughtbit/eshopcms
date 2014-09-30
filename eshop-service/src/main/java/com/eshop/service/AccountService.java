package com.eshop.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.eshop.model.Account;
import com.eshop.mappers.AccountMapper;

@Service
@Transactional
public class AccountService{
	@Autowired
	private AccountMapper accountMapper;
	void insert(Account account);
	
	void insertWithMap(Map<String, Object> map);

	int delete(int id);

	void update(Account account);

	Account findById(Integer id);

	List<Account> findAll();
}