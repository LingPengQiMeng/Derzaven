package com.accp.dao;

import java.util.List;

import com.accp.pojo.repairbill;

public interface repairbillMapper {
    int deleteByPrimaryKey(String odd);

    int insert(repairbill record);

    int insertSelective(repairbill record);

    repairbill selectByPrimaryKey(String odd);

    int updateByPrimaryKeySelective(repairbill record);

    int updateByPrimaryKey(repairbill record);
    
    List<repairbill> selectAll();
}