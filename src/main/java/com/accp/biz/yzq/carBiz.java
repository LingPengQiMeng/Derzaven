package com.accp.biz.yzq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.dao.cilcarMapper;
import com.accp.pojo.cilcar;
import com.accp.pojo.client;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class carBiz {

	@Autowired
	private cilcarMapper cilmapper;

	//分页查询
		public PageInfo<cilcar> select(Integer pageNum, Integer pageSize){
			PageHelper.startPage(pageNum, pageSize);
			return  new PageInfo<cilcar>(cilmapper.carlist());
		}
		
		
		
		//删除
		@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
		public int deleteById(String clrno) {
			return cilmapper.deleteByPrimaryKey(clrno);
		 }
		
	//根据姓名查询车辆资料
		public List<cilcar> selectBycliname(String cliname){
			return cilmapper.selectByCliname(cliname);
		}
}
