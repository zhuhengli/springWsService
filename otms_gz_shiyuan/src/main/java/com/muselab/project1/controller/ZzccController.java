package com.muselab.project1.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.muselab.project1.service.IntereFaceService;





@RestController
public class ZzccController {
	
	
	//@Autowired
  //  private MemberService memberService;
	@Autowired
	private IntereFaceService intereFaceService;
	
	 @RequestMapping(value="/zzcclist")
	 public ModelAndView list(Map<String,Object> map) {
	    	ModelAndView mv = new ModelAndView("zzcc"); 
	        return mv;
	 }
	 
	 
	 @RequestMapping(value="/zzcc")
	 public ModelAndView zzcc(Map<String,Object> map) {
	    	ModelAndView mv = new ModelAndView("zzccfee"); 
	        return mv;
	 }
	 
	 
	 
	  @RequestMapping(value="/zzccvalid")
	  @ResponseBody
	  public HashMap<String,Object> Valid(HttpServletRequest request) {
		  
	        String orderCode = request.getParameter("orderCode");
	        String feeType = request.getParameter("feeType");
	        String amount = request.getParameter("amount");
	        String remark = request.getParameter("remark");
	        return  intereFaceService.zzccRegistrationFees(orderCode, feeType, amount, remark);
	    }
	  
	  
	  
	  @RequestMapping(value="/registered")
	  @ResponseBody
	  public HashMap<String, Object>  registered(HttpServletRequest request) {
		    String content = "";
	        String orderCode = request.getParameter("erpCode");
	        String feeType = request.getParameter("feeType");
	        String amount = request.getParameter("amount");
	        String remark = request.getParameter("remark");
	       
//	        System.out.println("******"+"success");
//	        System.out.println("******"+orderCode);
//	        System.out.println("******"+feeType);
//	        System.out.println("******"+amount);
//	        System.out.println("******"+remark);
	        content = "费用类型："+feeType+" ; "+ remark;
	       
	       return  intereFaceService.zzccRegistrationFees(orderCode,null,amount,content);
	    }
	 
	 
	   @RequestMapping(value="/tabledate")
	   public ModelAndView tabletest(Map<String,Object> map) {
		    	ModelAndView mv = new ModelAndView("tabledate"); 
		        return mv;
		}
	 
	   @RequestMapping(value="/tabledatelist")
	   @ResponseBody
	   public Map<String, Object>  tabledatelist(HttpServletRequest request) {
			   
		     return  intereFaceService.listTableDate();
		   
		    }
}
