package com.muselab.project1.domain.shiyuan;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name = "orderOutboundResponse")
@XmlType(propOrder = { "orders","start","count","total"}) 
public class OrderOutboundResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 232160492971503052L;
	
	@XmlElementWrapper(name = "orders")  
    @XmlElement(name = "order")
	private List<Order> orders;
	
	@XmlElement(name = "start")
	private int start;
	
	@XmlElement(name = "count")
	private int count;
	
	@XmlElement(name = "total")
	private int total;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
	
	

}
