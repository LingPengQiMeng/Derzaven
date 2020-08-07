package com.accp.action.yzq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yzq.RepairbillBiz;
import com.accp.pojo.repairbill;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/yzq")
public class RepairbillAction {
	
	@Autowired
	private RepairbillBiz rebiz;
	
	//查询全部车辆
			@GetMapping("/selectRepairbill/{pageNum}/{pageSize}")
			@ResponseBody
			public PageInfo<repairbill> querys(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
				PageInfo<repairbill> list = rebiz.select(pageNum, pageSize);
				return list;
			}
}
