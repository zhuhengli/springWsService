package com.muselab.project1.domain.shiyuan;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD) 
@XmlType(propOrder = { "vendorDetail","orderStatus"})  
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6796511841769548758L;
	
	
    @XmlElement(name = "vendorDetail")
	private VendorDetail vendorDetail;
	
    @XmlElement(name = "orderStatus")
	private String orderStatus;

	public VendorDetail getVendorDetail() {
		return vendorDetail;
	}

	public void setVendorDetail(VendorDetail vendorDetail) {
		this.vendorDetail = vendorDetail;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
   
}
