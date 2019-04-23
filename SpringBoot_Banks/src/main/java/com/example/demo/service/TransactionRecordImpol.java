package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountMapper;
import com.example.demo.dao.TransactionRecordMapper;
import com.example.demo.pojo.Dates;
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

	@Override
	public int pass(TransactionRecord record) {
		int i = mapper.updatePass(record);
		return i;
	}

	@Override
	public List<TransactionRecord> findAll(Dates dates) {
		List<TransactionRecord> list = mapper.findAll(dates);
		return list;
	}

}
