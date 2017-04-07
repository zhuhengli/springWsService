package com.muselab.project1.webUtils;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.protocol.HTTP;



import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eden on 16-8-9.
 */
public class HttpUtil {
	
//	private static final Logger LOGGER = LoggerFactory.getLogger(HttpUtil.class);
	
	private static final int TIME_OUT = 120;

    /**
     * Generate put request with text entity to invoke restful interface by
     * httpcomponent
     * 
     * @param value
     * @param url
     * @return
     * @throws IOException
     */
    public static int putRequest(String value, String url) throws IOException {
        HttpClient httpClient = new DefaultHttpClient();
        HttpPut httpPutRequest = new HttpPut(url);
        StringEntity entity = new StringEntity(value, HTTP.UTF_8);
        httpPutRequest.addHeader("Content-Type", "application/xml;charset=UTF-8");
        httpPutRequest.setEntity(entity);
        HttpResponse httpResponse = httpClient.execute(httpPutRequest);
        StatusLine httpStatus = httpResponse.getStatusLine();
        return httpStatus.getStatusCode();
    }
    

    public static HttpResponse putRequestByHttp(String value, String url)  {
		HttpClient httpClient = new DefaultHttpClient();
		
		// 请求超时
		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, TIME_OUT * 1000); 
		// 读取超时
		httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, TIME_OUT * 1000);
		
		HttpPut httpPutRequest = new HttpPut(url);
		
		// PUT请求超时
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(TIME_OUT * 1000).setConnectTimeout(TIME_OUT * 1000).build();//设置请求和传输超时时间
		httpPutRequest.setConfig(requestConfig);
		httpPutRequest.addHeader("Content-Type", "application/xml;charset=UTF-8");
		
		StringEntity entity = new StringEntity(value, HTTP.UTF_8);
		httpPutRequest.setEntity(entity);
		try {
			return httpClient.execute(httpPutRequest);
		}  catch (Exception e) {
		//	LOGGER.error("HttpUtil  method putRequestByHttp throw  exception :{} "+e);
			return  null;
		}
	}

    /** 
     * 获取请求主机IP地址,如果通过代理进来，则透过防火墙获取真实IP地址; 
     *  
     * @param request 
     * @return 
     * @throws IOException 
     */  
    public static String getIpAddress(HttpServletRequest request) throws IOException {  
        String ip = request.getHeader("X-Forwarded-For");  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("Proxy-Client-IP");  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("WL-Proxy-Client-IP");  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("HTTP_CLIENT_IP");  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getRemoteAddr();  
            }  
        } else if (ip.length() > 15) {  
            String[] ips = ip.split(",");  
            for (int index = 0; index < ips.length; index++) {  
                String strIp = (String) ips[index];  
                if (!("unknown".equalsIgnoreCase(strIp))) {  
                    ip = strIp;  
                    break;  
                }  
            }  
        }  
        return ip;  
    }
    public  static  HttpResponse  healthPostRequest(String  url ,String  usernmae,String password) {
    	HttpClient httpClient = new DefaultHttpClient();
        HttpPost   post  =new HttpPost(url);
        post.setHeader("username", usernmae);
        post.setHeader("password", password);
        try {
        	return  httpClient.execute(post);
		} catch (IOException e) {
	//		LOGGER.error("HttpUtil  method healthpostRequest  throw  exception :{} "+e);
			return null;
		}
    }
}
