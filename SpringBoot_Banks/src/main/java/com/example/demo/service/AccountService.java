package com.example.demo.service;

import com.example.demo.pojo.Account;

public interface AccountService {
	
	//查询余额
	Account findMoney(int id);
}
