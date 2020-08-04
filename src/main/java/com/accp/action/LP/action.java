package com.accp.action.LP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.LP.EngineBiz;
import com.accp.pojo.Engine;

@RestController
@RequestMapping("/api/lingpeng")
public class action {
	@Autowired
	private EngineBiz engineBiz;
	
	@GetMapping("/QueryEngine")
	public List<Engine> query(){
		return engineBiz.query();
	}
	
	@GetMapping("/QueryIdEngine/{id}")
	public Engine queryId(@PathVariable("id") Integer id) {
		return engineBiz.queryId(id);
	}
	
	@PostMapping("/AddEngine")
	public Map<String, Object> add(@RequestBody Engine eng){
		Map<String, Object> message = new HashMap<String, Object>();
		if(engineBiz.add(eng) == 1) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "300");
			message.put("msg", "no");
		}
		return message;
	}
	
	@PutMapping("/UpdateEngine")
	public Map<String, Object> update(@RequestBody Engine eng){
		System.out.println(eng.getEngname());
		Map<String, Object> message = new HashMap<String, Object>();
		if(engineBiz.update(eng) == 1) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "300");
			message.put("msg", "no");
		}
		return message;
	}
	
	@DeleteMapping("/DeleteEngine/{id}")
	public Map<String, Object> deleteId(@PathVariable("id") Integer id) {
		System.out.println("a");
		Map<String, Object> message = new HashMap<String, Object>();
		if (engineBiz.delete(id) == 1) {
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "300");
			message.put("msg", "no");
		}
		return message;
	}
}
