package com.eshop.mappers;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.eshop.commons.Pager;
import com.eshop.model.Account;

/**
 * 
 * @author fuxin
 *
 */
public interface AccountMapper{
	@Delete("delete from Account where id=#{id}")
	int deleteAccount(int id);
	
	@Insert("insert into Account(username,password) values(#{username},#{password})")
	void createAccount(Account account);
	
	@Select("select * from Account where id=#{id}")
	Account findAccountById(int id);
	
	@Select("select * from Account")
	List<Account> findAccountAll();
	
	@Select("select count(*) from Account")
	int findAccountTotal();
	
	@Select("select * from Account limit #{showPages},#{pageSize}")
	Pager<Account> findAccountByPage(int showPages,int pageSize);
}