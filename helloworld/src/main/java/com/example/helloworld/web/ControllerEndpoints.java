package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@ResponseBody
public class ControllerEndpoints {
	/*
	@RequestMapping("/hello")
	public String hello(@RequestParam(name="firstname") String firstName, @RequestParam(name="lastname") String lastname) {
	 return "Hello " + fisrtname + " " + lastname;
	}*/
	@RequestMapping("/index")
	public String index() {
	 return "This is the index page";
	}
	@RequestMapping("/contact")
	public String contact() {
	 return "This is the contact page";
	}
}
