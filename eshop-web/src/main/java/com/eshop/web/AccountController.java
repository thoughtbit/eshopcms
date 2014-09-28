package com.eshop.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eshop.web.entity.Account;
import com.eshop.web.service.AccountService;
import com.eshop.web.common.Pager;

@Controller(value="accountController")
@RequestMapping("/account")
public class AccountController{
	@Resource(name="accountServiceImpl")
	private AccountService as;
	//数据添加
	@RequestMapping("/add")
	public String addAccount(HttpServletRequest req){
		Account acc = new Account();
		acc.setUsername(req.getParameter("username"));
		acc.setPassword(req.getParameter("password"));
		as.save(acc);
		
		req.setAttribute("name", req.getParameter("username"));
		return "login";	
	}
	
	//分页查询
	@RequestMapping("/pager")	
	public String findByPage(HttpServletRequest req) {
		int pageSize = 10;
		int showPages = 0;
		String sPageNo = req.getParameter("pager.offset");
		if(sPageNo!=null) {
			showPages = Integer.parseInt(sPageNo);
		}
		Pager<Account> pager = as.findByPage(showPages, pageSize);
		
		req.setAttribute("pager", pager);
		
		return "pager-list";
	}
	
}
