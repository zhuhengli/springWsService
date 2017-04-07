package com.muselab.project1.webUtils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.BasicManagedEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;





import org.dom4j.io.SAXReader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;








public class App {
//	public static void main(String[] args) throws Exception  {
//		   String soap = "<orderImportRequest xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\" version=\"0.1\" login=\"MB1VP71B\" password=\"1u23bpU8TWFuDyZr\"> "
//		     		+ " <orders>"
//		     		+ "<order sequence=\"1\">"
//		     		+ "<clientReferenceNumber>1</clientReferenceNumber> <branch>TJ Transfers</branch> <erpNumber>77315684861</erpNumber>  <shipFromExternalId>81J5</shipFromExternalId>"
//		     		+ "<shipToExternalId>8109</shipToExternalId>  <timeSchedule> <pickupDate>2016-08-12</pickupDate> <deliveryDate>2016-08-12</deliveryDate>  </timeSchedule>"
//		     		+ "<orderLines>  <orderLine>  <cargoDescription> <productCode>0024916022900069</productCode>  <productName>0024916022900069</productName> </cargoDescription>"
//		     		+ "<quantity>1</quantity>  <weight>3.417 </weight>  <volume>0.083790 </volume> </orderLine>  </orderLine> </orderLines>  <rejectDraft>true</rejectDraft>"
//		     		+ "<autoProcessMode>3</autoProcessMode>  <dispatchBy>1</dispatchBy>  <cargoDetails> <totalQuantity>1</totalQuantity> <totalWeight>3.417</totalWeight> <totalVolume>0.083790</totalVolume>"
//		     		+ " <cargoType>1</cargoType>  <packageType>A</packageType>  </cargoDetails> <transportMode>  <transportType>LTL</transportType> <truckType>2</truckType>  </transportMode>"
//		     		+ "<customFields>  <customText8>77315684861</customText8> <customEnum1>TJ Transfers</customEnum1> <customEnum2>GAR</customEnum2> <customEnum3>ONLY</customEnum3> <customEnum4>Retail</customEnum4>"
//		     		+ " <customEnum6>LOGISTIC</customEnum6> </customFields>  </order>  </orders> </orderImportRequest> ";
//		   
//		   
//		String requetParam = "<orderImportRequest version=\"0.1\" login=\"MB1VP71B\" password=\"1u23bpU8TWFuDyZr\">"
//				+ "<orders><order sequence=\"1\"><clientCode>AARONA</clientCode><clientReferenceNumber>说明</clientReferenceNumber> "
//				+ "<branch>广州</branch><erpNumber>160322010B</erpNumber> <orderRemarks>备注</orderRemarks><allowUpdate>false</allowUpdate>"
//				+ "<shipFromExternalId>GZ01</shipFromExternalId><shipToExternalId>SH01</shipToExternalId><timeSchedule> "
//				+ "<pickupDate>2016-04-28</pickupDate><deliveryDate>2016-04-29</deliveryDate></timeSchedule><orderLines><orderLine><cargoDescription> "
//				+ "<productCode>1</productCode><productName>普货</productName></cargoDescription><quantity>1</quantity><weight>1.000</weight>"
//				+ "<volume>1.000000</volume></orderLine></orderLines><rejectDraft>true</rejectDraft><autoProcessMode>3</autoProcessMode><cargoDetails>"
//				+ "<totalQuantity>1</totalQuantity><totalWeight>1</totalWeight><totalVolume>1</totalVolume><cargoType>1</cargoType><packageType>A</packageType>"
//				+ "</cargoDetails><transportMode><transportType>LTL</transportType><truckType>2</truckType></transportMode></order></orders></orderImportRequest>";
//		String url =  "https://demo.otms.cn/ws/orderImport";
//		
//		int  code = putRequest(requetParam,url);
//		
//		System.out.println("********************************");
//		
//		System.out.println("接口返回code:  "+code);
//		
//		System.out.println("********************************");
//		
//	     
//	}
	
	
//	private void test1() throws Exception{
//		 URL wsUrl = new URL("https://demo.otms.cn/ws/orderImport");
//			// https://demo.otms.cn/ws/externalTrackandTrace  
//			 HttpURLConnection conn = (HttpURLConnection) wsUrl.openConnection();
//			 conn.setDoInput(true);
//		     conn.setDoOutput(true);
//		     conn.setRequestMethod("PUT");
//		  //   conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
//		   conn.setRequestProperty("Content-Type", "application/xml;charset=UTF-8");
//		     OutputStream os = conn.getOutputStream();
//		     
//		     String soap = "<orderImportRequest xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\" version=\"0.1\" login=\"jswvBnhM\" password=\"Fgic37Yz4rF6gp3P\"> "
//		     		+ " <orders>"
//		     		+ "<order sequence=\"1\">"
//		     		+ "<clientReferenceNumber>1</clientReferenceNumber> <branch>TJ Transfers</branch> <erpNumber>77315684861</erpNumber>  <shipFromExternalId>81J5</shipFromExternalId>"
//		     		+ "<shipToExternalId>8109</shipToExternalId>  <timeSchedule> <pickupDate>2016-08-12</pickupDate> <deliveryDate>2016-08-12</deliveryDate>  </timeSchedule>"
//		     		+ "<orderLines>  <orderLine>  <cargoDescription> <productCode>0024916022900069</productCode>  <productName>0024916022900069</productName> </cargoDescription>"
//		     		+ "<quantity>1</quantity>  <weight>3.417 </weight>  <volume>0.083790 </volume> </orderLine>  </orderLine> </orderLines>  <rejectDraft>true</rejectDraft>"
//		     		+ "<autoProcessMode>3</autoProcessMode>  <dispatchBy>1</dispatchBy>  <cargoDetails> <totalQuantity>1</totalQuantity> <totalWeight>3.417</totalWeight> <totalVolume>0.083790</totalVolume>"
//		     		+ " <cargoType>1</cargoType>  <packageType>A</packageType>  </cargoDetails> <transportMode>  <transportType>LTL</transportType> <truckType>2</truckType>  </transportMode>"
//		     		+ "<customFields>  <customText8>77315684861</customText8> <customEnum1>TJ Transfers</customEnum1> <customEnum2>GAR</customEnum2> <customEnum3>ONLY</customEnum3> <customEnum4>Retail</customEnum4>"
//		     		+ " <customEnum6>LOGISTIC</customEnum6> </customFields>  </order>  </orders> </orderImportRequest> ";
//		     	
//		     
//		     os.write(soap.getBytes());
//		     InputStream is = conn.getInputStream();
//		     byte[] b = new byte[1024];
//		     int len = 0;
//		     String s = "";
//		     while((len = is.read(b)) != -1){
//		            String ss = new String(b,0,len,"UTF-8");
//		            s += ss;
//		        }
//		     System.out.println(s);
//		        
//		     is.close();
//		     os.close();
//		     conn.disconnect();
//	}
	 public static HashMap<String,String> postRequest(String value, String url) {
		 HashMap<String , String> map = new HashMap<String , String>(); 
		 HttpClient httpClient = new DefaultHttpClient();
		 HttpPost   post  =new HttpPost(url);
		 StringEntity entity = new StringEntity(value, HTTP.UTF_8);
	//	 post.addHeader("Content-Type", "application/xml;charset=UTF-8");
		 post.addHeader("Content-Type", "application/xml;charset=UTF-8");
		 post.setEntity(entity);
		 HttpResponse httpResponse;
		 String responseString = null;
		 try {
			httpResponse = httpClient.execute(post);
		//	StringEntity resutlentity = (StringEntity) httpResponse.getEntity();
			StatusLine httpStatus = httpResponse.getStatusLine();
			HttpEntity message = httpResponse.getEntity();
			BufferedInputStream bis = new BufferedInputStream(message.getContent());  
            byte[] bytes = new byte[1024];  
            ByteArrayOutputStream bos = new ByteArrayOutputStream();  
            int count = 0;  
            while((count = bis.read(bytes))!= -1){  
                bos.write(bytes, 0, count);  
            }  
            byte[] strByte = bos.toByteArray();  
            responseString = new String(strByte,0,strByte.length,"utf-8");  
            bos.close();  
            bis.close();  
		

			Integer httpCode =  httpStatus.getStatusCode();
			map.put("resutlCode", httpCode.toString());
			map.put("resutl", responseString);
		    return map;
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return map;
		 
	 }
	
	 public static HashMap<String,String> putRequest(String value, String url)  {
		    HashMap<String , String> map = new HashMap<String , String>(); 
			try {
				    String responseString = null;
				    HttpClient httpClient = new DefaultHttpClient();
			        HttpPut httpPutRequest = new HttpPut(url);
			        StringEntity entity = new StringEntity(value, HTTP.UTF_8);
			        httpPutRequest.addHeader("Content-Type", "application/xml;charset=UTF-8");
			        httpPutRequest.setEntity(entity);
			        HttpResponse httpResponse;
				    httpResponse = httpClient.execute(httpPutRequest);
				    StatusLine httpStatus = httpResponse.getStatusLine();
			        HttpParams message =  httpResponse.getParams();
			        System.out.println("********************************");
					System.out.println("接口返回message:  "+message.toString());
					System.out.println("********************************");
					HttpEntity httpEntity = httpResponse.getEntity();
					BufferedInputStream bis = new BufferedInputStream(httpEntity.getContent());  
		            byte[] bytes = new byte[1024];  
		            ByteArrayOutputStream bos = new ByteArrayOutputStream();  
		            int count = 0;  
		            while((count = bis.read(bytes))!= -1){  
		                bos.write(bytes, 0, count);  
		            }  
		            byte[] strByte = bos.toByteArray();  
		            responseString = new String(strByte,0,strByte.length,"utf-8");  
		            bos.close();  
		            bis.close();  
		            
		            Integer httpCode =  httpStatus.getStatusCode();
					map.put("resutlCode", httpCode.toString());
					map.put("resutl", responseString);
					
					return map;
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   return map;
	    }
	
	

}



