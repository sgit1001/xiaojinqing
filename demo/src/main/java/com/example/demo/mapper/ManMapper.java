package com.example.demo.mapper;

import com.example.demo.po.Man;
import com.example.demo.po.ManExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ManMapper {
    int countByExample(ManExample example);

    int deleteByExample(ManExample example);

    int deleteByPrimaryKey(Integer manId);

    int insert(Man record);

    int insertSelective(Man record);

    List<Man> selectByExample(ManExample example);

    Man selectByPrimaryKey(Integer manId);

    int updateByExampleSelective(@Param("record") Man record, @Param("example") ManExample example);

    int updateByExample(@Param("record") Man record, @Param("example") ManExample example);

    int updateByPrimaryKeySelective(Man record);

    int updateByPrimaryKey(Man record);
}