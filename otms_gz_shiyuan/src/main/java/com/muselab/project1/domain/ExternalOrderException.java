package com.muselab.project1.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name = "externalOrderException")
@XmlType(propOrder = {"remark", "charge", "claimTo"}) 
public class ExternalOrderException {

	 
	private String remark;
	
	private String charge;
	
	private String claimTo;
	
	
	
	
	
	public ExternalOrderException(){
		super();
	}
	
	public ExternalOrderException(String remark,String claimTo,String charge){
		this.remark= remark;
		this.claimTo= claimTo;
		this.charge= charge;
		
	}

	@XmlElement(name = "remark")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@XmlElement(name = "charge") 
	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	@XmlElement(name = "claimTo") 
	public String getClaimTo() {
		return claimTo;
	}

	public void setClaimTo(String claimTo) {
		this.claimTo = claimTo;
	}
	
	
	
	
	

}
