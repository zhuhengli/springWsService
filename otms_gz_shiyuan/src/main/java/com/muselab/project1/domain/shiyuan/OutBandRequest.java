package com.muselab.project1.domain.shiyuan;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name = "orderOutboundRequest")
@XmlType(propOrder = {"queries", "orderBy"}) 
public class OutBandRequest implements Serializable{
	
	private String version;
	private String login;
	private String password;
	private List<Queries> queries;
    private List<OrderBy> orderBy;
    
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 @XmlElementWrapper(name = "queries")  
     @XmlElement(name = "query")
	public List<Queries> getQueries() {
		return queries;
	}
	public void setQueries(List<Queries> queries) {
		this.queries = queries;
	}
	
	@XmlElement(name = "orderBy")
	public List<OrderBy> getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(List<OrderBy> orderBy) {
		this.orderBy = orderBy;
	}
    
    
    
}
