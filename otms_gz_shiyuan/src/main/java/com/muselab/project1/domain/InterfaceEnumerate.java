package com.muselab.project1.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 接口异常枚举
 * @author wil.zhu
 *
 */
@Entity
@Table(name="table_numerate")
public class InterfaceEnumerate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8809119052153086062L;
	
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
	
	
	 @Column(name="key_word") 
	 private  String keyword;
	 
	 @Column(name="value_en") 
	 private  String valueen;
	 
	 
	 @Column(name="create_time") 
	 private  String createtime;
	 
	 
	 @Column(name="remark") 
	 private  String remark;
	 
	 
	 @Column(name="interface_name") 
	 private  String interfacename;
	 
	 @Column(name="value_zh") 
	 private  String valuezh;

	 
	 
	 
	 
	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getValueen() {
		return valueen;
	}

	public void setValueen(String valueen) {
		this.valueen = valueen;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getInterfacename() {
		return interfacename;
	}

	public void setInterfacename(String interfacename) {
		this.interfacename = interfacename;
	}

	public String getValuezh() {
		return valuezh;
	}

	public void setValuezh(String valuezh) {
		this.valuezh = valuezh;
	}
	 
}
