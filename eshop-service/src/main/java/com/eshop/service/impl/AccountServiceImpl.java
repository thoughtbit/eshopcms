package com.eshop.service.impl;

import org.springframework.stereotype.Service;

import com.eshop.dao.base.AbstractBaseDao;
import com.eshop.model.Account;
import com.eshop.service.AccountService;

@Service
public class AccountServiceImpl extends AbstractBaseDao<Account,Integer> implements AccountService{

}
