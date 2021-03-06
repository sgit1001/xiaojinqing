package com.example.demo.xiaojinqing.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
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
	
	@RequestMapping("findMoney.do")
	public void selectById(String cardno, HttpServletResponse response) {
		try {
			response.getWriter().println(tr.findMoney(cardno).getBalance());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping("findCardNo.do")
	public void findCardNo( HttpServletRequest request,HttpServletResponse response) {
		try {
			response.getWriter().println(request.getSession().getAttribute("cardno"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
