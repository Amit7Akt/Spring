package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class BrotherController {	
		@ResponseBody //Http Response
		@RequestMapping("/computer")
		public String giveComputer() {
			return "this is your computer";
		}

	}
