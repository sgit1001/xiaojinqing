package com.example.demo.xiaojinqing.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.Account;
import com.example.demo.pojo.TransactionRecord;
import com.example.demo.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService tr;
	
	@RequestMapping("selectById.do")
	public Account selectById(int id) {
		return tr.findMoney(id);
	}
}
