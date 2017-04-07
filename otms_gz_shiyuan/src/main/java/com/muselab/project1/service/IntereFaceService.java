package com.muselab.project1.service;

import java.util.HashMap;
import java.util.Map;

public interface IntereFaceService {

	
	//中柱特殊费用注册服务
	/**
	 * 单号，费用类型，金额，备注
	 * @param orderCode
	 * @param feeType
	 * @param amount
	 * @param remark
	 * @return
	 */
	public HashMap<String,Object> zzccRegistrationFees(String orderCode, String feeType,String amount,String remark);
	
	
	
	/**
	 * 
	 */
	public Map<String,Object> listTableDate();
	
	
	
	/**
	 * 玉柴推送url接口
	 */
	
	public void pushUrlToYuchai(String msg);

	
	
}
