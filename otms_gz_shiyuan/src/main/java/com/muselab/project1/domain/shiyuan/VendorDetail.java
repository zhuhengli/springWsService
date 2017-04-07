package com.muselab.project1.domain.shiyuan;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD) 

@XmlType(propOrder = { "orderNumber","erpNumber","price"})  
public class VendorDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1821276947238460717L;
	
	@XmlElement(name = "orderNumber")
	private String  orderNumber;
	
	@XmlElement(name = "erpNumber")
	private  String erpNumber;
	
	@XmlElement(name = "price")
	private String price;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getErpNumber() {
		return erpNumber;
	}

	public void setErpNumber(String erpNumber) {
		this.erpNumber = erpNumber;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	

	@Override  
    public String toString() {  
        return "VendorDetail [orderNumber=" + orderNumber + ",erpNumber=" + erpNumber +",price=" + price + "]";  
    }  

}
