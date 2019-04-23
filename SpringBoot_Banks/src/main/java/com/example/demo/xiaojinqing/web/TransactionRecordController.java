package com.example.demo.xiaojinqing.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Dates;
import com.example.demo.pojo.TransactionRecord;
import com.example.demo.service.TransactionRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class TransactionRecordController {

	@Autowired
	private TransactionRecordService recode;
	
	@RequestMapping("findRecorde")
	public void findRecorde(String date1, String date2, String cardno, HttpServletRequest request,
			HttpServletResponse response) {
		response.setContentType("text/html;charset=utf-8");
		Map map = new HashMap<>();
		int ye = Integer.parseInt(request.getParameter("page"));// 页数
		int hang = Integer.parseInt(request.getParameter("rows"));// 行数
		String dates = "";
		if (date2.length() == 0 || date2 == null) {
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			dates = format.format(date);
		} else {
			dates = date2;
		}
		PageHelper.startPage(ye, hang);
		List<TransactionRecord> list = recode.findAll(new Dates(date1, dates, cardno));
		List<TransactionRecord> list2 = new ArrayList<TransactionRecord>();
		for (TransactionRecord transactionRecord : list) {
			list2.add(transactionRecord);
		}
		PageInfo info = new PageInfo<>(list2);
		map.put("rows", list2);
		map.put("total", info.getTotal());
		System.out.println(map);
		try {
			response.getWriter().println(map);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
