package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.accp.pojo.client;

public interface clientMapper {
    
	//查询
    List<client> select();
    
    //根据id查询
    client selectById(Integer clid);
    
    //修改
    int updateClient(client record);
    
    //删除
    int deleteById(Integer clid);
    
    //新增
    int addClient(@Param("record") client record);
}