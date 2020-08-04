package com.accp.dao;

import com.accp.pojo.carmodel;

public interface carmodelMapper {
    int deleteByPrimaryKey(Integer cmlid);

    int insert(carmodel record);

    int insertSelective(carmodel record);

    carmodel selectByPrimaryKey(Integer cmlid);

    int updateByPrimaryKeySelective(carmodel record);

    int updateByPrimaryKey(carmodel record);
}