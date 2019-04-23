package com.example.demo.dao;

import com.example.demo.pojo.Account;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AccountMapper extends CrudRepository<Account, Integer>{
   
}