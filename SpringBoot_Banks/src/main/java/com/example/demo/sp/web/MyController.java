package com.example.demo.sp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.TransactionRecordService;

@Controller
public class MyController {
	@Autowired
	private  TransactionRecordService tran;
	
	@RequestMapping("/login")
	public  int login(String username, String pwd,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Integer id = tran.selectcardno(username);
		//1.登录成功，2.账号冻结，3.密码错误，4.账号有误。
			if (id>0) {
				session.setAttribute("id", id);
				String  selectpwd = tran.selectpwd(username);
				if(selectpwd.equals(pwd)) {
					Integer status = tran.selectstatus(username);
					if(status == 1) {
						session.setAttribute("cardno", username);
						return 1;
					}else {
						return 2;
					}
					
				}else {
					return 3;
				}
			}else {
				return 4;
			}
	}
	@RequestMapping("/out")
	public String  out(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("cardno");
		return "login.html";
	}
	
}
