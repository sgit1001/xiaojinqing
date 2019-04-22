package com.example.demo.service;

import com.example.demo.pojo.TransactionRecord;

public interface TransactionRecordService {
	
	//查询余额
	TransactionRecord findMoney(int id);
}
