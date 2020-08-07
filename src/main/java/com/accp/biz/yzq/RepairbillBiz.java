package com.accp.biz.yzq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.repairbillMapper;
import com.accp.pojo.repairbill;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class RepairbillBiz {

	@Autowired
	private repairbillMapper remapper;
	
	//分页查询
		public PageInfo<repairbill> select(Integer pageNum, Integer pageSize){
			PageHelper.startPage(pageNum, pageSize);
			return  new PageInfo<repairbill>(remapper.selectAll());
		}
}
