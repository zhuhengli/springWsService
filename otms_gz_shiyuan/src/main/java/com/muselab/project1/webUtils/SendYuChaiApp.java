package com.muselab.project1.webUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class SendYuChaiApp {
	
	 public static String sendYuChaiPost(String url){
		   String  content = "";
		 
		    try {

                URL restServiceURL = new URL(url);

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
                	content += output;
                }

                httpConnection.disconnect();
                return content;

           } catch (MalformedURLException e) {

                e.printStackTrace();

           } catch (IOException e) {

                e.printStackTrace();

           }
			return content;
	 }
}
