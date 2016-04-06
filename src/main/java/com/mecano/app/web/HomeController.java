package com.mecano.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
//	@ResponseBody
	@RequestMapping("/")
	public String welcome(){
		
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/poste")
	public String post(@RequestParam String email){
		
		System.out.println(email);
		return "OK";
	}
}
