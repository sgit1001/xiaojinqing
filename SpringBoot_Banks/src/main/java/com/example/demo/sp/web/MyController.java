package com.example.demo.sp.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TransactionRecordService;

@RestController
public class MyController {
	@Autowired
	private  TransactionRecordService tran;
	
	@RequestMapping("login")
	public  void login(String username, String pwd,HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		int id = tran.selectcardno(username);
		//1.登录成功，2.账号冻结，3.密码错误，4.账号有误。
		try {
			if (id>0) {
				session.setAttribute("id", id);
				String  selectpwd = tran.selectpwd(username);
				if(selectpwd.equals(pwd)) {
					Integer status = tran.selectstatus(username);
					if(status == 1) {
						session.setAttribute("cardno", username);
						response.getWriter().println(1);
					}else {
						response.getWriter().println(2);
					}
					
				}else {
					response.getWriter().println(3);
				}
			}else {
				response.getWriter().println(4);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	@RequestMapping("out")
	public void  out(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("cardno");
		response.getWriter().println("<script>window.location.href='bankLogin.html'</script>");
	}
	
}
