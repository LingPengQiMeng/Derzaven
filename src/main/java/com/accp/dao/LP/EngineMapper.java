package com.accp.dao.LP;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Engine;

public interface EngineMapper {
	//查询全部
	List<Engine> query();
	
	//增加
	int add(@Param("eng")Engine eng);
	
	//修改
	int update(@Param("eng")Engine eng);
	
	//删除
	int delete(@Param("id")Integer id);
	
	//查询id
	Engine queryId(@Param("id")Integer id);
}