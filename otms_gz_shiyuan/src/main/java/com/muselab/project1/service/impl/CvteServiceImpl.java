package com.muselab.project1.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.muselab.project1.domain.CvteOrderTemp;
import com.muselab.project1.domain.orderShareResponse.OrderShareResponse;
import com.muselab.project1.domain.shiyuan.Order;
import com.muselab.project1.domain.shiyuan.OrderBy;
import com.muselab.project1.domain.shiyuan.OrderOutboundResponse;
import com.muselab.project1.domain.shiyuan.OutBandRequest;
import com.muselab.project1.domain.shiyuan.Queries;
import com.muselab.project1.domain.shiyuan.VendorDetail;
import com.muselab.project1.repository.CvteOrderTempRepository;
import com.muselab.project1.service.CvteService;
import com.muselab.project1.webUtils.App;
import com.muselab.project1.webUtils.JaxbUtil;
import com.muselab.project1.webUtils.JaxbUtil.CollectionWrapper;
@Service
@Transactional
public class CvteServiceImpl implements CvteService{
    
	@Autowired
	private CvteOrderTempRepository cvteOrderTempRepository;
	
	
	@Override
	public void dealOrderDate(List<CvteOrderTemp> cvteOrderTemps) {
		// TODO Auto-generated method stub
		for(CvteOrderTemp cvteOrderTemp : cvteOrderTemps){
			cvteOrderTempRepository.save(cvteOrderTemp);
		}
	}

	@Override
	public HashMap<String, Object> postOutBound(LocalDate beginDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		
		String body = getPostStr(beginDate,endDate);
		HashMap<String,String> code = App.postRequest(body, "https://demo.otms.cn/ws/orderOutbound");
		JaxbUtil responseBinder = new JaxbUtil(OrderOutboundResponse.class,  
	             CollectionWrapper.class); 
	     String  result = code.get("resutl");
	     OrderOutboundResponse response =  responseBinder.fromXml(result);
	     
	     System.out.println(response);
	     List<CvteOrderTemp> cvteOrderTempList = new ArrayList<CvteOrderTemp>();
	     for(Order order :response.getOrders()){
	    	 CvteOrderTemp cvteOrderTemp = new CvteOrderTemp();
	    	 VendorDetail vend = order.getVendorDetail();
	    	 cvteOrderTemp.setOtmsCode(vend.getOrderNumber());
	    	 cvteOrderTempList.add(cvteOrderTemp);
	   }  
	     
	     if(cvteOrderTempList.size()>0){
	    	 this.dealOrderDate(cvteOrderTempList);
	     }
	     return null;
		
	}
	
	
	private String getPostStr(LocalDate beginDate, LocalDate endDate){
		
		
		 OutBandRequest outBandRequest = new OutBandRequest();
		 outBandRequest.setLogin("BfFDW0BY");
		 outBandRequest.setPassword("YjzM9267HWmMX6sQ");
		 outBandRequest.setVersion("0.1");
		 
		 Queries queries2 = new Queries();
		 queries2.setAttribute("createTime");
		 queries2.setGe(beginDate.toString());
		 queries2.setLe(endDate.toString());
		 
		 List<Queries> queries = new ArrayList<Queries>();
		 queries.add(queries2);
		 
		 outBandRequest.setQueries(queries);
		 OrderBy orderBy = new OrderBy();
		 orderBy.setDesc("createTime");
		 List<OrderBy> orderBys = new ArrayList<OrderBy>();
		 orderBys.add(orderBy);
		 outBandRequest.setOrderBy(orderBys);
		 
		 //将java对象转换为XML字符串  
		 JaxbUtil requestBinder = new JaxbUtil(OutBandRequest.class,  
	             CollectionWrapper.class);  
	     String retXml = requestBinder.toXml(outBandRequest, "utf-8");  
	     System.out.println(retXml);
	     return retXml;
	}
	

}
