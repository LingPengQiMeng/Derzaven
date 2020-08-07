package com.accp.dao;

import com.accp.pojo.record;

public interface recordMapper {
    int deleteByPrimaryKey(Integer recid);

    int insert(record record);

    int insertSelective(record record);

    record selectByPrimaryKey(Integer recid);

    int updateByPrimaryKeySelective(record record);

    int updateByPrimaryKey(record record);
}