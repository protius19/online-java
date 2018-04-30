package com.protius.onlinejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
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
