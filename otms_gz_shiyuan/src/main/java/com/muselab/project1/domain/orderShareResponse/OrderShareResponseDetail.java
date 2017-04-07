package com.muselab.project1.domain.orderShareResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD) 
@XmlType(propOrder = { "status", "code","orderNumber","url"})  
public class OrderShareResponseDetail {
	@XmlAttribute(name="sequence")
	private String sequence;

	@XmlElement(name = "status")
	private String status;
	
	@XmlElement(name = "code")
	private String code;
	
	@XmlElement(name = "orderNumber")
	private String orderNumber;
	
	@XmlElement(name = "url")
	private String url;
	
	
	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
	  @Override  
	  public String toString() {  
	        return "OrderShareResponseDetail [status=" + status + ", code=" + code +", orderNumber=" + orderNumber + ", url=" + url +  "]";  
	  } 
}
