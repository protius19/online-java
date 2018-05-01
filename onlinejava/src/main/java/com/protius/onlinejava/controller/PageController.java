package com.protius.onlinejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.protius.shoppingbackendjava.dao.CategoryDAO;
import com.protius.shoppingbackendjava.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		
		//passing the list of category
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickhome",true);
		return mv;
		
		
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About");
		mv.addObject("userClickabout",true);
		return mv;
		
	}	
	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact");
		mv.addObject("userClickcontact",true);
		return mv;
		
	}		
	
	/*
	 * method to load all product and base on category
	 * */
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Products");
		
		//passing the list of category
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickAllProducts",true);
		return mv;
		
		
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		
		ModelAndView mv = new ModelAndView("page");
		
		//categoryDAO to fetch a single category
		Category category = null;
		category = categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		
		//passing the list of category
		mv.addObject("categories",categoryDAO.list());
		
		//passing single category object
		mv.addObject("category",category);
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;
		
		
	}
	
	// Demo Coding 
	
//	@RequestMapping(value = "/test")
//	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting) {
//		
//		ModelAndView mv = new ModelAndView("page");
//		
//		if(greeting == null) {
//			greeting = "Welcome unknown";
//		}
//		if(greeting.equals("1")) {
//			mv.addObject("greeting","Welcome Teddy");	
//		}else if(greeting.equals("2")) {
//			mv.addObject("greeting","Welcome Dessy");
//		}else {
//			mv.addObject("greeting","Welcome My Guess");
//		}
//		
//		return mv;
//	}
	
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting) {
		
		ModelAndView mv = new ModelAndView("page");
		
		if(greeting == null) {
			greeting = "Welcome unknown";
		}
		if(greeting.equals("1")) {
			mv.addObject("greeting","Welcome Teddy");	
		}else if(greeting.equals("2")) {
			mv.addObject("greeting","Welcome Dessy");
		}else {
			mv.addObject("greeting","Welcome My Guess");
		}
		
		return mv;
	}
	
	// demo coding

}
