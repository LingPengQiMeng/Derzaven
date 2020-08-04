package com.accp.biz.LP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.EngineMapper;
import com.accp.pojo.Engine;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class EngineBiz {
	@Autowired 
	private EngineMapper engineMapper;
	
	public List<Engine> query(){
		return engineMapper.query();
	}
	
	public Engine queryId(Integer id) {
		return engineMapper.queryId(id);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int add(Engine eng) {
		return engineMapper.add(eng);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Engine eng) {
		return engineMapper.update(eng);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delete(Integer id) {
		return engineMapper.delete(id);
	}
	
}
