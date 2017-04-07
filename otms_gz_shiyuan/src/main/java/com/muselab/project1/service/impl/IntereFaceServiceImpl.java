package com.muselab.project1.service.impl;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.xml.sax.InputSource;

import com.muselab.project1.domain.ExternalOrderException;
import com.muselab.project1.domain.ExternalOrderQuery;
import com.muselab.project1.domain.InterfaceEnumerate;
import com.muselab.project1.domain.InterfaceUrl;
import com.muselab.project1.domain.Member;
import com.muselab.project1.domain.MessageLog;
import com.muselab.project1.domain.UserKey;
import com.muselab.project1.domain.ZzccTemplate;
import com.muselab.project1.domain.yuchai.OrderShareRequest;
import com.muselab.project1.repository.InterfaceEnumerateRepository;
import com.muselab.project1.repository.InterfaceUrlRepository;
import com.muselab.project1.repository.MemberRepository;
import com.muselab.project1.repository.UserKeyRepository;
import com.muselab.project1.service.IntereFaceService;
import com.muselab.project1.service.LogMessageService;
import com.muselab.project1.service.SendStatus;
import com.muselab.project1.webUtils.App;
import com.muselab.project1.webUtils.JaxbUtil;
import com.muselab.project1.webUtils.JaxbUtil.CollectionWrapper;
import com.muselab.project1.webUtils.SendYuChaiApp;
@Service
@Transactional
public class IntereFaceServiceImpl implements IntereFaceService{
	
	private final static  String  CLASSNAME = "com.muselab.project1.service.impl.IntereFaceServiceImpl";
	
	//中柱注册特殊费用
	private final static  String  interface_zzcc = "externalTrackandTrace";
	
	@Autowired
	private UserKeyRepository userKeyRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	 
	@Autowired
	private LogMessageService logMessageService;
	
	@Autowired
	private InterfaceEnumerateRepository interfaceEnumerateRepository;
	
	@Autowired
	private InterfaceUrlRepository  interfaceUrlRepository;
	 
	@Override
	public HashMap<String,Object> zzccRegistrationFees(String orderCode, String feeType,
			String amount, String remark) {
		// TODO Auto-generated method stub
		List<UserKey> list = userKeyRepository.findKeyByParam("zzcc");
		if(list.size()==0){
			 HashMap<String,Object> mapErr = new HashMap<>();
			 mapErr.put("code", "202");
			 mapErr.put("result", "企业用户名和密码未维护请通知管理员进行维护");
			return mapErr;
		}
		//封装xml
		UserKey userKey = list.get(0);
		ZzccTemplate zzccTemplate = new ZzccTemplate("0.1",userKey.getLogin(),userKey.getPassword(),"EXCEPTION_G1");
		
		List<ExternalOrderQuery>  externalOrderQueries = new ArrayList<>();
		ExternalOrderQuery externalOrderQuery = new ExternalOrderQuery();
		externalOrderQuery.setAttribute("erpNumber");
		externalOrderQuery.setEq(orderCode);
		externalOrderQueries.add(externalOrderQuery);
		if(StringUtils.isEmpty(feeType) || feeType==null ){
			feeType	="VENDOR";
		}
		ExternalOrderException externalOrderException = new ExternalOrderException(remark,feeType,amount);
		zzccTemplate.setExternalOrderException(externalOrderException);
		zzccTemplate.setExternalOrderQueries(externalOrderQueries);
		//生成报文xml
		//将java对象转换为XML字符串  
		 JaxbUtil requestBinder = new JaxbUtil(ZzccTemplate.class,  
	             CollectionWrapper.class);  
	     String retXml = requestBinder.toXml(zzccTemplate, "utf-8");  
	     //请求前写日志
	     MessageLog logBefore = new MessageLog();
	     logBefore.setOrderCode(orderCode);
	     logBefore.setLogin(userKey.getLogin());
	     logBefore.setPassword(userKey.getPassword());
	     logBefore.setType(SendStatus.NOT_SENT);
	     logBefore.setMethodName("zzccRegistrationFees");
	     logBefore.setClassName(CLASSNAME);
	     logBefore.setContent(retXml);
	     logBefore.setRemark("Special Charges for Registration");
	     logBefore.setCreatetime(new Date());
	     logMessageService.logMessage(logBefore);
	     //获取url
	     InterfaceUrl  interfaceUrl = interfaceUrlRepository.findOne(interface_zzcc);
		//调用接口
	     HashMap<String,String> mapres = App.postRequest(retXml, interfaceUrl.getUrl());
	     String resutlCode = mapres.get("resutlCode");
	     HashMap<String,Object> result = new HashMap<String,Object>();
	     
	     //请求后写日志
	     MessageLog logAfter = new MessageLog();
	     
	     logAfter.setOrderCode(orderCode);
	     logAfter.setLogin(userKey.getLogin());
	     logAfter.setPassword(userKey.getPassword());
	     logAfter.setType(SendStatus.SEND);
	     logAfter.setMethodName("zzccRegistrationFees");
	     logAfter.setClassName(CLASSNAME);
	     logAfter.setContent(retXml);
	     logAfter.setCreatetime(new Date());
	     logAfter.setResult(mapres.get("resutl"));
	     logAfter.setResutlcode(resutlCode);
	     logAfter.setRemark("Special Charges for Registration");
	     logMessageService.logMessage(logAfter);
	    
	     if(resutlCode.equals("200")){
	    	 String responeCode = "";
		     String	responeResult = "";
	    	 String resutl = mapres.get("resutl");
	    	 HashMap<String,String> responeMap =  this.getvalueByXml(resutl);
	    	 String  flag = responeMap.get("status");
	    	 if(flag.equals("SUCCEED")){
	    		  responeCode = "200";
	    	}
	    	
	    	if(flag.equals("FAILED")){
	    		responeCode = responeMap.get("errCode");
	    	}
	       InterfaceEnumerate interfaceEnumerate = interfaceEnumerateRepository.findEnumerateByParamOne(responeCode, interface_zzcc);
	       responeResult = interfaceEnumerate.getValuezh();
	       result.put("code", responeCode);
	       result.put("result", responeResult);
	     }else{
	    	 InterfaceEnumerate interfaceEnumerate2 = interfaceEnumerateRepository.findEnumerateByParamOne("201", interface_zzcc);
	    	 result.put("code", "201");
		     result.put("result", interfaceEnumerate2.getValuezh());
	     }
		 return result;
	}
	
	private HashMap<String,String> getvalueByXml(String xmlStr){
		
		HashMap<String,String> maplist = new HashMap<String,String>();
		 StringReader read = new StringReader(xmlStr);
    	 InputSource source = new InputSource(read);
    	 SAXReader sb = new SAXReader();
    	 Document doc;
    	 String reStr = "";
		try {
			 doc = sb.read(source);
			 Element root = doc.getRootElement();
		     for (Iterator iter = root.elementIterator(); iter.hasNext();) {
		    	    Element element = (Element) iter.next(); // 获取标签对象
	                // 获取该标签对象的属性
		    	    maplist.put(element.getName(),element.getTextTrim());
	                // 循环第一层节点，获取其子节点
	                for (Iterator iterInner = element.elementIterator(); iterInner
	                        .hasNext();) {
	                    // 获取标签对象
	                    Element elementOption = (Element) iterInner.next();
	                    maplist.put(elementOption.getName(),elementOption.getTextTrim());
	                    
	                    for (Iterator iterInnerlast = elementOption.elementIterator(); iterInnerlast
		                        .hasNext();) {
		                    // 获取标签对象
		                    Element elementOptionChaild = (Element) iterInnerlast.next();
		                    maplist.put(elementOptionChaild.getName(),elementOptionChaild.getTextTrim());
		                }
	                    
	                }
             }
	         return maplist;
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
            return maplist;
	}

	@Override
	public Map<String, Object> listTableDate() {
		// TODO Auto-generated method stub
		HashMap<String, Object> list = new HashMap<String, Object>();
//		List<>  memberRepository.findAll()
		List<Member> restult = memberRepository.findAll();
		list.put("list", restult);
		return  list;
	}

	@Override
	public void pushUrlToYuchai(String msg) {
		// TODO Auto-generated method stub
		//封装获取url报文
		String shareUrl = "";
		OrderShareRequest orderShareRequest = new OrderShareRequest();
		JaxbUtil requestBinder = new JaxbUtil(OrderShareRequest.class,  
	             CollectionWrapper.class);  
	     String retXml = requestBinder.toXml(orderShareRequest, "utf-8"); 
	     
	     App.putRequest(retXml, shareUrl);
		
		//调用share接口进行 获取订单的url
		
		//解析resutl
		
		//封装到实体
		
		//进行转化xml
		
		//httpencode 进行处理
		
		
		
		String orderUrl = null;
		//写日志
		String resulmsgForYuChai = SendYuChaiApp.sendYuChaiPost(orderUrl);
		//写日志
		
	}

}
