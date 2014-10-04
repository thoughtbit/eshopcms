package com.eshop.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eshop.model.Account;
import com.eshop.service.AccountService;
import com.eshop.commons.Pager;

@Controller(value="accountController")
@RequestMapping("/account")
public class AccountController{
	
	private static Logger logger = LoggerFactory.getLogger(AccountService.class);
	
	@Resource(name="accountServiceImpl")
	private AccountService accountService;
	
	//数据添加
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addAccount(HttpServletRequest req){
		Account acc = new Account();
		acc.setUsername(req.getParameter("username"));
		acc.setPassword(req.getParameter("password"));
		accountService.createAccount(acc);
		logger.info("{}", acc);
		req.setAttribute("name", req.getParameter("username"));
		return "login";	
	}
	
	//分页查询
	@RequestMapping(value = "/pager", method = RequestMethod.GET)
	public String findByPage(HttpServletRequest req) {
		int pageSize = 10;
		int showPages = 0;
		String sPageNo = req.getParameter("pager.offset");
		if(sPageNo!=null) {
			showPages = Integer.parseInt(sPageNo);
		}
		Pager<Account> pager = accountService.findByPage(showPages, pageSize);
		
		req.setAttribute("pager", pager);
		
		return "admin/users-list";
	}
	
}
