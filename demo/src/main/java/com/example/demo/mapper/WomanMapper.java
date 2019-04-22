package com.example.demo.mapper;

import com.example.demo.po.Woman;
import com.example.demo.po.WomanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface WomanMapper {
    int countByExample(WomanExample example);

    int deleteByExample(WomanExample example);

    int deleteByPrimaryKey(Integer womId);

    int insert(Woman record);

    int insertSelective(Woman record);

    List<Woman> selectByExample(WomanExample example);

    Woman selectByPrimaryKey(Integer womId);

    int updateByExampleSelective(@Param("record") Woman record, @Param("example") WomanExample example);

    int updateByExample(@Param("record") Woman record, @Param("example") WomanExample example);

    int updateByPrimaryKeySelective(Woman record);

    int updateByPrimaryKey(Woman record);
}