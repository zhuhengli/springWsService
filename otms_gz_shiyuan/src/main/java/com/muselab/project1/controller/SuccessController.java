package com.muselab.project1.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
@RequestMapping ( "/msg" ) 
public class SuccessController {
	
	
	 @RequestMapping(value="/success")
	 public ModelAndView success(Map<String,Object> map) {
	    	ModelAndView mv = new ModelAndView("success"); 
	        return mv;
	 }

}
