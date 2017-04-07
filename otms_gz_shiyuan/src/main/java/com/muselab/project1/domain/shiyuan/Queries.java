package com.muselab.project1.domain.shiyuan;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "query")
@XmlType(propOrder = {"attribute", "eq","ge","le"}) 
public class Queries implements Serializable{
	
	private String attribute;
	
	private String eq;
	
	private String ge;
	
	private String le;
	
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
	@XmlElement(name = "ge")
	public String getGe() {
		return ge;
	}

	public void setGe(String ge) {
		this.ge = ge;
	}
	@XmlElement(name = "le")
	public String getLe() {
		return le;
	}

	public void setLe(String le) {
		this.le = le;
	}
	
	
	

}
