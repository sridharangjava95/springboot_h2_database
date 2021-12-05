package com.hsbcselfpractice.springboot_h2_database.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hsbcselfpractice.springboot_h2_database.dao.BusBookingDao;
import com.hsbcselfpractice.springboot_h2_database.model.Bus;

@Controller
public class bookingController {
	@Autowired
	BusBookingDao busBookingDao;
	
	@RequestMapping("/booking")
	public ModelAndView getbookingpage() {

		/*
		 * ArrayList<Bus> busList = new ArrayList<Bus>(); Bus b1 = new Bus("SS TRAVELS",
		 * 9898, "Semi Sleeper", "Ramesh", 13.30); Bus b2 = new Bus("SS TRAVELS", 8787,
		 * "Sleeper", "Karthi", 15.30); busList.add(b1); busList.add(b2);
		 */
		
		List<Bus>busList= busBookingDao.findAll();
		ModelAndView mav = new ModelAndView("booking", "busList", busList);
		return mav;
	}
	@GetMapping("/showAddBus")
	public ModelAndView getshowaddbuspage() {
		Bus bus = new Bus();
		ModelAndView mav = new ModelAndView("addbus","form",bus);
		return mav;
	}
	@PostMapping("/showAddBus")
	public String addNewBus (Bus bus) {
		busBookingDao.save(bus);
		return "redirect:/booking";
	}
	@RequestMapping("/deleteBus")
	public String deleteBus(@RequestParam int busNumber) {
		busBookingDao.deleteById(busNumber);
		return "redirect:/booking";
	}
	@RequestMapping("/passengerdetails")
	public ModelAndView getpassengerdetails() {
		ModelAndView mav = new ModelAndView("passengerdetails");
		return mav;
	}
	

}
