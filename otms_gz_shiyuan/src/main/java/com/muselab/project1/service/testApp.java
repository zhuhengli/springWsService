package com.muselab.project1.service;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

public class testApp {
	public static void main(String[] args) {

//		 String xmlStr = "<Response><ORDERS><RESULT_CODE>00</RESULT_CODE><RESULT_DESC>成功</RESULT_DESC></ORDERS></Response>";
//		 HashMap<String,String> maplist = new HashMap<String,String>();
//		 StringReader read = new StringReader(xmlStr);
//    	 InputSource source = new InputSource(read);
//    	 SAXReader sb = new SAXReader();
//    	 Document doc;
//    	 String reStr = "";
//		 try {
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
//	     System.out.println(maplist);
//		} catch (DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		test();
          
               }
		
    
	public static void test(){
		String url = "http://60.22.24.19:9086/WebFront/outerDataServlet?"
	       		+ "msgType=shareOrder&userid=xinyang&sign=80a919bcd2f37b9f50175cb6d62b6742&msg=";
			 
	        String value = "%3CRequest%3E%0A%3CORDERS%3E%0A%09%09%3CORDER%3E%0A%09%09%09%3CerpNumber%3Eaaaaaa%3C/erpNumber%3E%0A%09%09%09%3Curl%3Ewww.aaa.com%3C/url%3E%0A%09%09%3C/ORDER%3E%0A%09%09%3CORDER%3E%0A%09%09%09%3CerpNumber%3Ebbbb%3C/erpNumber%3E%0A%09%09%09%3Curl%3Ewww.ttt.com%3C/url%3E%0A%09%09%3C/ORDER%3E%0A%09%09%3CORDER%3E%0A%09%09%09%3CerpNumber%3Eccc%3C/erpNumber%3E%0A%09%09%09%3Curl%3Ewww.ccc.com%3C/url%3E%0A%09%09%3C/ORDER%3E%0A%0A%3C/ORDERS%3E%0A%3C/Request%3E";
			
	       
	        

	 

	                 try {

	                      URL restServiceURL = new URL(url+value);

	                      HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
	                      httpConnection.setRequestMethod("POST");
	                      httpConnection.setRequestProperty("Accept", "application/json");

	                      if (httpConnection.getResponseCode() != 200) {
	                             throw new RuntimeException("HTTP GET Request Failed with Error code : "
	                                           + httpConnection.getResponseCode());
	                      }

	                      BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
	                             (httpConnection.getInputStream())));

	                      String output;
	                      System.out.println("Output from Server:  \n");

	                      while ((output = responseBuffer.readLine()) != null) {
	                             System.out.println(output);
	                      }

	                      httpConnection.disconnect();

	                 } catch (MalformedURLException e) {

	                      e.printStackTrace();

	                 } catch (IOException e) {

	                      e.printStackTrace();

	                 }
	}

}
