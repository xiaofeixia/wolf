package com.nf.yun.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nf.yun.web.service.HelloService;

@Controller
public class HelloAction {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/test/hello.htm")
	public String hello(ModelMap modelMap){
		
		modelMap.addAttribute("msg", helloService.hello());
		
		return "/test/hello";
	}
}
