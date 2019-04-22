package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ManMapper;
import com.example.demo.po.Man;
import com.example.demo.po.ManExample;

@Service
public class MyManServiceimpil implements MyManService {
	@Autowired
	private ManMapper man;
	@Override
	public int countByExample(ManExample example) {
		// TODO Auto-generated method stub
		return man.countByExample(example);
	}
	@Override
	public Man selectByPrimaryKey(Integer manId) {
		// TODO Auto-generated method stub
		return man.selectByPrimaryKey(manId);
	}
	@Override
	public List<Man> selectByExample(ManExample example) {
		// TODO Auto-generated method stub
		return man.selectByExample(example);
	}
	@Override
	public int deleteByPrimaryKey(Integer manId) {
		// TODO Auto-generated method stub
		int i = man.deleteByPrimaryKey(manId);
		return i;
	}

}
