package com.Lab23.Lab23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Lab23.Lab23.entity.users;
import com.Lab23.Lab23.jpa.CoffeeRepository;
import com.Lab23.Lab23.jpa.UsersRepository;



@Controller
public class CoffeeShopController {
	
//	@Autowired
//	PersonRepository p;
	
	@Autowired
	CoffeeRepository c;
	
	@Autowired
	UsersRepository u;
	

	
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "coffee", c.findAll());
	}
	
	@RequestMapping("/registry")
	public ModelAndView registry() {
		return new ModelAndView("registry");
	}
	
	@RequestMapping("/search")
	public ModelAndView searchResults(@RequestParam("itemid") Integer id){
		return new ModelAndView("summary", "results", c.findById(id).orElse(null));
	}
	
	@RequestMapping("/adduser")
	public ModelAndView addNewUser(@RequestParam("fname")String firstname, @RequestParam("lname")String lastname, @RequestParam("email")String email, @RequestParam("phone")String phonenumber, @RequestParam("password")String password) {
		users p1 = new users(firstname, lastname, email, phonenumber, password);
		u.save(p1);
		return new ModelAndView("redirect:/");
	}
	
	
	
	
	
	

}
