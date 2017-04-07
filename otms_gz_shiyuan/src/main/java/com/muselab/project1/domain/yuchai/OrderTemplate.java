package com.muselab.project1.domain.yuchai;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "order")
@XmlType(propOrder = {"erpNumber", "orderNumber"}) 
public class OrderTemplate {
	
	private String sequence;
	
	private String erpNumber;
	
	private String orderNumber;

	
	@XmlAttribute(name="sequence")
	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	@XmlElement(name = "erpNumber")
	public String getErpNumber() {
		return erpNumber;
	}

	public void setErpNumber(String erpNumber) {
		this.erpNumber = erpNumber;
	}
	
	@XmlElement(name = "orderNumber")
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	
	

}
