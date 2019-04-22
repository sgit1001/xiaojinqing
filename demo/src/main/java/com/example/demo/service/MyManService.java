package com.example.demo.service;

import java.util.List;

import com.example.demo.po.Man;
import com.example.demo.po.ManExample;

public interface MyManService {
	 int countByExample(ManExample example);
	 Man selectByPrimaryKey(Integer manId);
	 List<Man> selectByExample(ManExample example);
	 int deleteByPrimaryKey(Integer manId);
}
