package com.hsbcselfpractice.springboot_h2_database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcomeController {
	@RequestMapping("/welcome")
	public ModelAndView getwelcomepage() {
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}

}
