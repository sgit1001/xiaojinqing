package com.example.demo.dao;

import com.example.demo.pojo.TransactionRecord;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TransactionRecordMapper extends CrudRepository<TransactionRecord, Integer>{
   
}