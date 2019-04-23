package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TransactionRecordMapper;
import com.example.demo.pojo.TransactionRecord;

@Service
public class TransactionRecordImpol implements TransactionRecordService {

	@Autowired
	private TransactionRecordMapper mapper;
	
	@Override
	public TransactionRecord findMoney(int id) {
		Optional<TransactionRecord> optional = mapper.findById(id);
		return optional.get(); 
	}

}
