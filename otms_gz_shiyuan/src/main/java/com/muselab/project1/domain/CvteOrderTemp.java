package com.muselab.project1.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cvte_order_temp")
public class CvteOrderTemp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6153168545933910966L;
	
	
	@Id
	@GeneratedValue
	@Column(name="id") 
	private Long id;
	
	@Column(name="otms_code")
	private String otmsCode;
	
	@Column(name="otms_price")
	private String otmsPrice;
	
	@Column(name="otms_final_rate")
	private String otmsFinalRate;
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOtmsCode() {
		return otmsCode;
	}

	public void setOtmsCode(String otmsCode) {
		this.otmsCode = otmsCode;
	}

	public String getOtmsPrice() {
		return otmsPrice;
	}

	public void setOtmsPrice(String otmsPrice) {
		this.otmsPrice = otmsPrice;
	}

	public String getOtmsFinalRate() {
		return otmsFinalRate;
	}

	public void setOtmsFinalRate(String otmsFinalRate) {
		this.otmsFinalRate = otmsFinalRate;
	}
	
	
	

}
