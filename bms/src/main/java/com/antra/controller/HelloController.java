package com.antra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hi")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String getData(ModelMap model) {
		System.out.println("in spring class");
		model.addAttribute("welcome","This s a spring programming");
		return "Welcome";
		
	}
}
