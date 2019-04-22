package com.example.demo;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.po.Man;
import com.example.demo.po.ManExample;
import com.example.demo.service.MyManService;
@RestController
public class Students {
	@Autowired
	private MyManService myman;
	@RequestMapping("km")
	public List  test() {
		List<Man> list = myman.selectByExample(new ManExample());
		System.out.println(list);
		return list;
	}
	@RequestMapping("rm")
	public int deletes(int manId) {
		int i = myman.deleteByPrimaryKey(manId);
		return i;
	}
}
