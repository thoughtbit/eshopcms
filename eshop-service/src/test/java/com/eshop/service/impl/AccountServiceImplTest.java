package com.eshop.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eshop.model.Account;
import com.eshop.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:test-applicationContext.xml"})
public class AccountServiceImplTest{
	
	private static Logger logger = LoggerFactory.getLogger(AccountService.class);
	
	@Autowired
	private AccountService accountService;
	
	@Test
	public void testFindAllAccounts() {
		List<Account> accounts = accountService.findAccountAll();
		assertNotNull(accounts);
		for (Account account : accounts){
			System.err.println(account);
		}
	}

	@Test
	public void testFindAccountById() {
		Account account = accountService.findAccountById(1);
		
		System.err.println(account);
		System.err.println(account.getUsername()+":"+account.getUsername());
	}

	
	@Test
	public void testCreateAccount() {
		Account account = new Account();
		account.setUsername("moocss@126.com");
		account.setPassword("123456");
		System.err.println("CreatedAccount: "+account);
	}

	@Test
	public void testDeleteAccount() {
		int deleted = accountService.deleteAccount(3);
		System.err.println("deleteAccount:"+deleted);
	}
}
