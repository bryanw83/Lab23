package com.Lab23.Lab23;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CoffeeShopController {
	
	@Autowired
	private Person p;
	
	@Autowired
	CoffeeDao dao;
	
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index", "firstPage", "");
		return mv;
		
	}
	
	@RequestMapping("/registry")
		public ModelAndView regPage() {
		return new ModelAndView("registry");
	}
	
	@RequestMapping("/coffee")
	public ModelAndView listCoffee(@RequestParam(value="name", required=false) String name) {
		ModelAndView mv = new ModelAndView("/");
		if(name != null && !name.isEmpty()) {
			mv.addObject("items", dao.findByName(name));
			mv.addObject("name", name);
		} else {
			mv.addObject("items", dao.findAllItems());
		}
		
		return mv;
	}
	
	
	

}
