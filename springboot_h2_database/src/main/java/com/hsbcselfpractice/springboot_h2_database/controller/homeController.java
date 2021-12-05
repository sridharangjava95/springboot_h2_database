package com.hsbcselfpractice.springboot_h2_database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	@RequestMapping("/home")
	public ModelAndView gethomepage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}

}
