package com.accp.dao;

import com.accp.pojo.carbrand;

public interface carbrandMapper {
    int deleteByPrimaryKey(Integer cbdid);

    int insert(carbrand record);

    int insertSelective(carbrand record);

    carbrand selectByPrimaryKey(Integer cbdid);

    int updateByPrimaryKeySelective(carbrand record);

    int updateByPrimaryKey(carbrand record);
}