package com.eshop.service.impl;

import org.springframework.stereotype.Service;

import com.eshop.web.base.AbstractBaseDao;
import com.eshop.web.entity.Account;
import com.eshop.web.service.AccountService;

@Service
public class AccountServiceImpl extends AbstractBaseDao<Account,Integer> implements AccountService{

}
