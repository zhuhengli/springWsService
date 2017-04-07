package com.muselab.project1.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "externalOrderQuery")
@XmlType(propOrder = {"attribute", "eq"}) 
public class ExternalOrderQuery {
	private String attribute;
	
	private String eq;

	@XmlElement(name = "attribute")
	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	@XmlElement(name = "eq") 
	public String getEq() {
		return eq;
	}

	public void setEq(String eq) {
		this.eq = eq;
	}
	
	

}
