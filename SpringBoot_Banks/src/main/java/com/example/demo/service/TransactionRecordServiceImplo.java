package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TransactionRecordMapper;
import com.example.demo.pojo.Dates;
import com.example.demo.pojo.TransactionRecord;


@Service
public class TransactionRecordServiceImplo implements TransactionRecordService {
	@Autowired
	private TransactionRecordMapper mapper;


	@Override
	@Transactional
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
