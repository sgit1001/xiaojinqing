package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountMapper;
import com.example.demo.dao.TransactionRecordMapper;
import com.example.demo.pojo.TransactionRecord;

@Service
public class TransactionRecordImpol implements TransactionRecordService {

	@Autowired
	private TransactionRecordMapper mapper;
	@Autowired
	private AccountMapper account;
	
	@Override
	public TransactionRecord findMoney(int id) {
		TransactionRecord optional = mapper.selectByPrimaryKey(id);
		return optional; 
	}

	@Override
	public Integer selectcardno(String cardno) {
		// TODO Auto-generated method stub
		Integer integer = account.selectcardno(cardno);
		return integer;
	}

	@Override
	public String selectpwd(String cardno) {
		// TODO Auto-generated method stub
		String string = account.selectpwd(cardno);
		return string;
	}

	@Override
	public Integer selectstatus(String cardno) {
		// TODO Auto-generated method stub
		Integer integer = account.selectstatus(cardno);
		return integer;
	}

}
