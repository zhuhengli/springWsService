package com.muselab.project1.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="userKey")
public class UserKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4134229841203685967L;

	
	 @Id
	 @GeneratedValue
	 @Column(name="id") 
	 private Long id; 
	 
	 /**    **/
	 @Column(name="name")
	 private String name;
	 
	 /**    **/
	 @Column(name="code")
	 private String code;
	 
	 /**    **/
	 @Column(name="login")
	 private String login;
	 
	 /**    **/
	 @Column(name="password")
	 private String password;
	 
	 /**    **/
	 @Column(name="create_time")
	 private Date createTime;
	 
	 /**    **/
	 @Column(name="deleted")
	 private Boolean deleted = Boolean.FALSE;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	 
}
