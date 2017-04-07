package com.muselab.project1.service;


import java.util.HashMap;
import java.util.List;

import org.joda.time.LocalDate;

import com.muselab.project1.domain.CvteOrderTemp;


public interface CvteService {
	
	//申明处理订单数据接口-存入临时订单表
		public void dealOrderDate(List<CvteOrderTemp> cvteOrderTemps);
		
		
		public HashMap<String, Object> postOutBound(LocalDate beginDate,LocalDate endDate);
}
