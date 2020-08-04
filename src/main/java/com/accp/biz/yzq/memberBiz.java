package com.accp.biz.yzq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.dao.clientMapper;
import com.accp.pojo.client;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class memberBiz {
	@Autowired
	private clientMapper clientmapper;
	
	//分页查询
	public PageInfo<client> select(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return  new PageInfo<client>(clientmapper.select());
	}
	
	//根据id查询
	public client selectById(Integer clid) {
		client cl = clientmapper.selectById(clid);
		return cl;
	}
	
	//修改
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateClient(client record) {
		return clientmapper.updateClient(record);
	 }
	
	//删除
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteById(Integer clid) {
		return clientmapper.deleteById(clid);
	 }
	
	//新增
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addClient(client record) {
		System.out.println(record.getCliname());
		return clientmapper.addClient(record);
	}
}
