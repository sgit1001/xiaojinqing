package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.po.Man;
import com.example.demo.service.ManInnterService;

@RestController
public class ManController {
	@Autowired
	private ManInnterService s;
	
	@RequestMapping("man")
	public Man manshow() {
		Man man = s.findMan();
		System.out.println(man.getManName());
		return man;
	} 
}
