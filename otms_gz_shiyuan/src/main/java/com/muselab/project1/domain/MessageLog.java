package com.muselab.project1.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="message_log")
public class MessageLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3839803882201034672L;
	
     @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="id")
     private Long id;
	 
    @Column(name="ordercode") 
    private  String orderCode;
    
    
    @Column(name="login") 
    private  String login;
    
    @Column(name="password") 
    private  String password;
    
    @Column(name="content") 
    private  String content;
    
    @Column(name="type")
    private  String type;
    
    @Column(name="createtime")
    private  Date createtime;
    
    @Column(name="httpcode")
    private  String httpcode;
    
    @Column(name="resutlcode")
    private  String resutlcode;
    
    @Column(name="result")
    private  String result;
    
    @Column(name="remark")
    private  String remark;
    
    @Column(name="methodname")
    private  String methodName;
    
    @Column(name="classname")
    private String className;

    
    
    

	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getOrderCode() {
		return orderCode;
	}


	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
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


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}



	public Date getCreatetime() {
		return createtime;
	}


	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}


	public String getHttpcode() {
		return httpcode;
	}


	public void setHttpcode(String httpcode) {
		this.httpcode = httpcode;
	}


	public String getResutlcode() {
		return resutlcode;
	}


	public void setResutlcode(String resutlcode) {
		this.resutlcode = resutlcode;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getMethodName() {
		return methodName;
	}


	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}
    
    
    
    
    
    
}
