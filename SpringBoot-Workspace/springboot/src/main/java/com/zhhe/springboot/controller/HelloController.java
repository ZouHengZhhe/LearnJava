package com.zhhe.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hellospringboot")
	public String test() {
		return "Hello SpringBoot!";
	}
	
	@RequestMapping("/hello")
//	@ResponseBody
	public Map<String,String> hello(){
		Map<String, String> hello=new HashMap<String,String>();
		hello.put("data", "hello 小红");
		hello.put("status", "SUCCESS");
		return hello;
	}
}
