package com.example.demo.xiaojinqing.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

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
	public void selectById(int id, HttpServletResponse response) {
		try {
			response.getWriter().println(tr.findMoney(id).getBalance());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
