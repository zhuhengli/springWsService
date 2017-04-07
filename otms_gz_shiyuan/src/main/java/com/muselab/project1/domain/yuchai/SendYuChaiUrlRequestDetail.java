package com.muselab.project1.domain.yuchai;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD) 
@XmlType(propOrder = { "erpNumber", "url"})  
public class SendYuChaiUrlRequestDetail {
    
	@XmlElement(name = "erpNumber")
	private String erpNumber;
  
	@XmlElement(name = "url")
    private String url;

	public String getErpNumber() {
		return erpNumber;
	}

	public void setErpNumber(String erpNumber) {
		this.erpNumber = erpNumber;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
    
    
}
