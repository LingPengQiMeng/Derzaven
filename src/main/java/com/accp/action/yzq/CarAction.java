package com.accp.action.yzq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yzq.carBiz;
import com.accp.pojo.cilcar;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/yzq")
public class CarAction {
	
	@Autowired
	private carBiz carbiz;
	

	
		//查询全部车辆
		@GetMapping("/selects/{pageNum}/{pageSize}")
		@ResponseBody
		public PageInfo<cilcar> querys(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
			PageInfo<cilcar> list = carbiz.select(pageNum, pageSize);
			return list;
		}
		//根据车牌号删除车辆
				@DeleteMapping("deleteCarById/{clrno}")
				@ResponseBody
				public int delete(@PathVariable("clrno") String clrno) {
					System.out.println("进入删除方法");
					return carbiz.deleteById(clrno);
		}
			
		//根据客户姓名查找属于该客户的车辆资料
		@GetMapping("selectBycliname/{cliname}")
		@ResponseBody
		public List<cilcar> selectBycliname(@PathVariable("cliname") String cliname){
			System.out.println("进入根据客户姓名查找属于该客户的车辆资料");
			List<cilcar> list = carbiz.selectBycliname(cliname);
			System.out.println(list);
			return list;
		}
}
