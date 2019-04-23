package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountMapper;
import com.example.demo.pojo.Account;

@Service
public class AccountImpol implements AccountService{

	@Autowired
	private AccountMapper map;
	
	@Override
	public Account findMoney(int id) {
		Account optional = map.selectByPrimaryKey(id);
		return optional; 
	}

}
