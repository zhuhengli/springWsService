package com.muselab.project1.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WinXinController {
	
	 @RequestMapping(value="/winxin")
	 public ModelAndView list(Map<String,Object> map) {
	    	ModelAndView mv = new ModelAndView("weixintest"); 
	        return mv;
	 }
}
