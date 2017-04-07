package com.muselab.project1.domain.shiyuan;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "orderBy")
public class OrderBy {

	private String desc;

	@XmlElement(name = "desc")
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
