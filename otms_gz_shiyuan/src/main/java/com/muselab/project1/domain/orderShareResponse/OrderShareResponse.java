package com.muselab.project1.domain.orderShareResponse;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name = "orderShareResponse")
@XmlType(propOrder = { "responseCode","successNum","failNum","orders"})  
public class OrderShareResponse {
	
	@XmlAttribute(name="version")
	private String version;
	
	@XmlElement(name = "responseCode")
	private String responseCode;
	
	@XmlElement(name = "successNum")
	private String successNum;
	
	@XmlElement(name = "failNum")
	private String failNum;

	@XmlElementWrapper(name = "orders")  
    @XmlElement(name = "order")
	private List<OrderShareResponseDetail> orders;
	
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
	public String getSuccessNum() {
		return successNum;
	}

	public void setSuccessNum(String successNum) {
		this.successNum = successNum;
	}
	
	
	public String getFailNum() {
		return failNum;
	}

	public void setFailNum(String failNum) {
		this.failNum = failNum;
	}
	
	
	
	public List<OrderShareResponseDetail> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderShareResponseDetail> orders) {
		this.orders = orders;
	}
	
	@Override  
    public String toString() {  
        return "OrderShareResponse [responseCode=" + responseCode + ",successNum=" + successNum +",failNum=" + failNum +",orders=" + orders + "]";  
    }  

}
