package com.eshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eshop.commons.Pager;
import com.eshop.mappers.AccountMapper;
import com.eshop.model.Account;
import com.eshop.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public void createAccount(Account account) {
		accountMapper.createAccount(account);
	}

	@Override
	public int deleteAccount(int id) {
		return accountMapper.deleteAccount(id);
	}

	@Override
	public Account findAccountById(int id) {
		return accountMapper.findAccountById(id);
	}

	@Override
	public int findTotal() {
		return accountMapper.findAccountTotal();
	}

	@Override
	public Pager<Account> findByPage(int showPages, int pageSize) {
		return accountMapper.findAccountByPage(showPages, pageSize);
	}

	@Override
	public List<Account> findAccountAll() {
		return accountMapper.findAccountAll();
	}

}
