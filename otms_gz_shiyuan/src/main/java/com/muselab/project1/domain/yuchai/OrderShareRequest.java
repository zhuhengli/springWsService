package com.muselab.project1.domain.yuchai;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 接口订单共享模板
 * @author wil.zhu
 *
 */

@XmlRootElement(name = "orderShareRequest")
public class OrderShareRequest {

	 private  String version;
	
	 private String login;
	 
	 private String passWord;
	 
	 private List<OrderTemplate> orders;

	 @XmlAttribute(name="version")
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@XmlAttribute(name="login")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	@XmlAttribute(name="password")
	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	@XmlElementWrapper(name = "orders")  
    @XmlElement(name = "order")
	public List<OrderTemplate> getOrders() {
		return orders;
	}

	
	public void setOrders(List<OrderTemplate> orders) {
		this.orders = orders;
	}
	 
	 
	 
}


