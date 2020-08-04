package com.accp.action.yzq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yzq.memberBiz;
import com.accp.pojo.client;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/yzq")
public class ClientAuction {
	
	@Autowired
	private memberBiz mbiz;
	
	//查询
	@GetMapping("/selec/{pageNum}/{pageSize}")
	@ResponseBody
	public PageInfo<client> querys(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		PageInfo<client> list = mbiz.select(pageNum, pageSize);
		return list;
	}
	
	@GetMapping("/selectById/{id}")
	@ResponseBody
	public client selectById(@PathVariable Integer id) {
		System.out.println("进入方法");
		return mbiz.selectById(id);
	}
	
	
	//修改
	@PutMapping("update")
	public int updateClient(@RequestBody client record) {
		return mbiz.updateClient(record);
		
	}
	
	//删除
	@DeleteMapping("deleteById/{id}")
	@ResponseBody
	public int delete(@PathVariable Integer id) {
		System.out.println("进入删除方法");
		return mbiz.deleteById(id);
	}
	
		//新增
		@PostMapping("add")
		public int addClient(@RequestBody client record) {
			System.out.println(record.getCliname());
			System.out.println(record.getCliphone());
			System.out.println("进入add方法");
			return mbiz.addClient(record);
		}
}
