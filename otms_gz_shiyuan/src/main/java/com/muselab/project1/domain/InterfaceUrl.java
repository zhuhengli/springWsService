package com.muselab.project1.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="table_interfaceurl")
public class InterfaceUrl implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -234673992111458938L;
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
	
	
	@Column(name="code")
	private String code;
	
	@Column(name="url")
	private String url;
	
	@Column(name="remark")
	private String remark;


	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	
	
}
