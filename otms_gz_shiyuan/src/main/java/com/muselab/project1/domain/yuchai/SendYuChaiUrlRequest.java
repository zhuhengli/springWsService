package com.muselab.project1.domain.yuchai;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name = "Request")
@XmlType(propOrder = {"orders"})  
public class SendYuChaiUrlRequest {
	
	@XmlElementWrapper(name = "ORDERS")  
    @XmlElement(name = "ORDER")
	private List<SendYuChaiUrlRequestDetail> orders;

	public List<SendYuChaiUrlRequestDetail> getOrders() {
		return orders;
	}

	public void setOrders(List<SendYuChaiUrlRequestDetail> orders) {
		this.orders = orders;
	}
	
	
	

}
