package com.eshop.web;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eshop.service.AccountService;

@Controller
public class IndexController{
	
	private static Logger logger = LoggerFactory.getLogger(AccountService.class);

	//分页查询
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		logger.info("进入首页");
		return "/front/login";
	}
	
}
