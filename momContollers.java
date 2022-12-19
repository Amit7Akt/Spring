package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mom")
public class momContollers {
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		return "Here is your Sugar";
	}
	@ResponseBody
	@RequestMapping("/food")
	
	public String giveFood() {
		return "this is your food";
	}
}
