package com.accp.dao;

import java.util.List;

import com.accp.pojo.cilcar;

public interface cilcarMapper {
    int deleteByPrimaryKey(String clrno);

    int insert(cilcar record);

    int insertSelective(cilcar record);

    cilcar selectByPrimaryKey(String clrno);

    int updateByPrimaryKeySelective(cilcar record);

    int updateByPrimaryKey(cilcar record);
    
    List<cilcar> carlist();
}