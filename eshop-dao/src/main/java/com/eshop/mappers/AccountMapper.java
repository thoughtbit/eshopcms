package com.eshop.mappers;

import com.eshop.model.Account;

public interface AccountMapper {

	void insert(Account account);
	
	void insertWithMap(Map<String, Object> map);

	int delete(int id);

	void update(Account account);

	Account findById(Integer id);

	List<Account> findAll();

	Pager<Account> findByPage(int showPages,int pageSize);

	int findTotal();

}