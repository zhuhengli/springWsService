package com.muselab.project1.domain;


import java.util.ArrayList;
import java.util.List;

import com.muselab.project1.domain.orderShareResponse.OrderShareResponse;
import com.muselab.project1.domain.shiyuan.OrderBy;
import com.muselab.project1.domain.shiyuan.OutBandRequest;
import com.muselab.project1.domain.shiyuan.Queries;
import com.muselab.project1.webUtils.JaxbUtil;
import com.muselab.project1.webUtils.JaxbUtil.CollectionWrapper;
import com.muselab.project1.webUtils.JaxbUtil2;

public class JavaToXmlTest {
	
	
	
 public static void main(String[] args) {
	 
	 OutBandRequest outBandRequest = new OutBandRequest();
	 outBandRequest.setLogin("BfFDW0BY");
	 outBandRequest.setPassword("YjzM9267HWmMX6sQ");
	 outBandRequest.setVersion("0.1");
	 
	 Queries queries1 = new Queries();
	 queries1.setAttribute("orderStatus");
	 queries1.setEq("dispatched");
	 
	 Queries queries2 = new Queries();
	 queries2.setAttribute("createTime");
	 queries2.setGe("2014-7-1");
	 queries2.setLe("2018-7-31");
	 
	 List<Queries> queries = new ArrayList<Queries>();
	 queries.add(queries1);
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
     System.out.println("xml:"+retXml); 
	 
	 
	 
	 
	
     
     
     
    
           	 	 
 }
 
 private void test(){
	 
	 ZzccTemplate zzcc = new ZzccTemplate();
	 zzcc.setOperation("EXCEPTION_G1");
	 zzcc.setVersion("1.0");
	 zzcc.setLogin("MB1VP71B");
	 zzcc.setPassWord("1u23bpU8TWFuDyZr");
	 
	 
	 List<ExternalOrderQuery> externalOrderQueries = new ArrayList<>();
	 ExternalOrderQuery externalOrderQueriey = new  ExternalOrderQuery();
	 externalOrderQueriey.setAttribute("orderNumber");
	 externalOrderQueriey.setEq("SPTEST01000132");
	 externalOrderQueries.add(externalOrderQueriey);
	 zzcc.setExternalOrderQueries(externalOrderQueries);
	 
	 
	 ExternalOrderException externalOrderException = new ExternalOrderException();
	 externalOrderException.setRemark("过路费");
	 externalOrderException.setCharge("100");
	 
	 externalOrderException.setClaimTo("CLIENT");
	 externalOrderException.setCharge("100");
	 externalOrderException.setRemark("过路费");
	 
	 zzcc.setExternalOrderException(externalOrderException);
	 	 
	 //将java对象转换为XML字符串  
	 JaxbUtil requestBinder = new JaxbUtil(ZzccTemplate.class,  
             CollectionWrapper.class);  
     String retXml = requestBinder.toXml(zzcc, "utf-8");  
     System.out.println("xml:"+retXml); 
    
     
     //将xml字符串转换为java对象  
//     JaxbUtil resultBinder = new JaxbUtil(ZzccTemplate.class,  
//            CollectionWrapper.class);  
//    ZzccTemplate hotelObj = resultBinder.fromXml(retXml);
//     System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//     System.out.println(hotelObj.getVersion());
//     System.out.println(hotelObj.getLogin());
//     System.out.println(hotelObj.getPassWord());
//     System.out.println(hotelObj.getOperation());
 }
	
//	public static void main(String[] args) {
//		OrderShareRequest orderShareRequest = new OrderShareRequest();
//		OrderTemplate orderTemplate1 = new OrderTemplate();
//		OrderTemplate orderTemplate2 = new OrderTemplate();
//		List<OrderTemplate> list = new ArrayList<OrderTemplate>();
//		orderShareRequest.setVersion("0.1");
//		orderShareRequest.setLogin("BfFDW0BY");
//		orderShareRequest.setPassWord("YjzM9267HWmMX6sQ");
//		orderTemplate1.setSequence("1");
//		orderTemplate2.setSequence("2");
//		orderTemplate1.setErpNumber("");
//		orderTemplate2.setErpNumber("");
//		orderTemplate1.setOrderNumber("HBWL1000002");
//		orderTemplate2.setOrderNumber("HBWL1000001");
//		
//		
//		list.add(orderTemplate1);
//		list.add(orderTemplate2);
//		orderShareRequest.setOrders(list);
//		
//		 JaxbUtil requestBinder = new JaxbUtil(OrderShareRequest.class,  
//	             CollectionWrapper.class);  
//	     String retXml = requestBinder.toXml(orderShareRequest, "utf-8"); 
//	     System.out.println(retXml);
//	     System.out.println("***************************");
//	     HashMap<String,String> code = App.putRequest(retXml, "https://demo.otms.cn/ws/order/share");
//	     System.out.println(code);
//	     String  result = code.get("resutl");
//	     System.out.println("***************************");
//	     HashMap<String,String> responeMap =  getvalueByXml(result);
//	     System.out.println(responeMap);
//	     System.out.println("***************************");
//	     System.out.println(result);
		
//	     String xmlstr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
//	     		+ "<orderShareResponse version=\"0.1\">"
//	     		+ "<responseCode>2400</responseCode>"
//	     		+ "<successNum>2</successNum>"
//	     		+ "<failNum>0</failNum>"
//	     		+ "<orders>"
//	     		+ "<order sequence=\"1\">"
//	     		+ "<status>SUCCEED</status>"
//	     		+ "<code>2400</code>"
//	     		+ "<orderNumber>HBWL1000002</orderNumber>"
//	     		+ "<url>https://demo.otms.cn/mp/?tab=ALL#/order-preview/8469F516151E6DA8/2f568fd01728e2f018458186eadc2ab3</url>"
//	     		+ "</order>"
//	     		+ "<order sequence=\"2\">"
//	     		+ "<status>SUCCEED</status>"
//	     		+ "<code>2400</code>"
//	     		+ "<orderNumber>HBWL1000001</orderNumber>"
//	     		+ "<url>https://demo.otms.cn/mp/?tab=ALL#/order-preview/A5354639A1CE23AC/c6b7c32eb0033810a484f52dc8623f28</url>"
//	     		+ "</order>"
//	     		+ "</orders>"
//	     		+ "</orderShareResponse>";
	     
	//     JaxbUtil responseBinder = new JaxbUtil(OrderShareResponse.class,  
	//             CollectionWrapper.class);  
	  //   OrderShareResponse response =  responseBinder.fromXml(xmlstr);
	     
	     
//	     OrderShareResponse response =  JaxbUtil2.converyToJavaBean(xmlstr, OrderShareResponse.class);
//	     System.out.println(response);
	}
	
//	
//      public static  HashMap<String,String> getvalueByXml(String xmlStr){
//		
//		HashMap<String,String> maplist = new HashMap<String,String>();
//		 StringReader read = new StringReader(xmlStr);
//    	 InputSource source = new InputSource(read);
//    	 SAXReader sb = new SAXReader();
//    	 Document doc;
//    	 String reStr = "";
//		try {
//			 doc = sb.read(source);
//			 Element root = doc.getRootElement();
//		     for (Iterator iter = root.elementIterator(); iter.hasNext();) {
//		    	    Element element = (Element) iter.next(); // 获取标签对象
//	                // 获取该标签对象的属性
//		    	    maplist.put(element.getName(),element.getTextTrim());
//	                // 循环第一层节点，获取其子节点
//	                for (Iterator iterInner = element.elementIterator(); iterInner
//	                        .hasNext();) {
//	                    // 获取标签对象
//	                    Element elementOption = (Element) iterInner.next();
//	                    maplist.put(elementOption.getName(),elementOption.getTextTrim());
//	                    
//	                    for (Iterator iterInnerlast = elementOption.elementIterator(); iterInnerlast
//		                        .hasNext();) {
//		                    // 获取标签对象
//		                    Element elementOptionChaild = (Element) iterInnerlast.next();
//		                    maplist.put(elementOptionChaild.getName(),elementOptionChaild.getTextTrim());
//		                }
//	                    
//	                }
//             }
//	         return maplist;
//		} catch (DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	
//            return maplist;
//	}
//}
