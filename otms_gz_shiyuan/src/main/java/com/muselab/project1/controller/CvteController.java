package com.muselab.project1.controller;



import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.muselab.project1.service.CvteService;

@RestController
public class CvteController {
    @Autowired
    private CvteService cvteService;
    
    @RequestMapping(value="/cvte")
	 public ModelAndView zzcc(Map<String,Object> map) {
	    	ModelAndView mv = new ModelAndView("cvte"); 
	        return mv;
	 }
    
    
      @RequestMapping(value="/cvte.do")
	  @ResponseBody
	  public HashMap<String,Object> Valid(HttpServletRequest request) {
    	
	        String beginDate = request.getParameter("beginDate");
	        String endDate = request.getParameter("endDate");
	        LocalDate beDate = new LocalDate(beginDate);
	        LocalDate enDate = new LocalDate(endDate);
	        
	        return  cvteService.postOutBound(beDate,enDate);
	    }
}
