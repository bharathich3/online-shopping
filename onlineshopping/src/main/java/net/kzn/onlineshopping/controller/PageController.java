package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");// internal resource view resolver
		mv.addObject("greeting", "Welcome to Spring Web MVC");
		return mv;

	}

	// Using @RequestParam -to get the value from the query String
	// Ex:http://localhost:8080/onlineshopping/test?greeting=Hello
//	@RequestMapping(value = "/test")
//	public ModelAndView test(@RequestParam(value = "greeting",required = false)String greeting) {
//		if(greeting==null) {
//			greeting="Hello There";
//		}
//		
//		ModelAndView mv=new ModelAndView("page");//internal resource view resolver
//		mv.addObject("greeting",greeting);
//		return mv;	
//	}
	// Using @PathVariable-to get the value from the path
	// Ex:http://localhost:8080/onlineshopping/test/hello
//	@RequestMapping(value = "/test/{greeting}")
//	public ModelAndView test(@PathVariable("greeting") String greeting) {
//		if (greeting == null) {
//			greeting = "Hello There";
//		}
//
//		ModelAndView mv = new ModelAndView("page");// internal resource view resolver
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
}
