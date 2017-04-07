package com.muselab.project1.domain;

public enum OrderStatusEnum {

	NEW("new","新订单"),RECEIVED("received","新订单"),
	RELEASED("released","新订单"),VENDORRELEASED("vendorReleased","新订单"),DISPATCHED("dispatched","新订单"),
	VENDORDISPATCHED("vendorDispatched","新订单"),PICKED("picked","新订单"),DELIVERED("delivered","新订单"),
	CLIENTBILLED("clientBilled","新订单"),VENDORBILLED("vendorBilled","新订单"),CLOSED("closed","新订单");
	private OrderStatusEnum(String value,String name){
		this.value = value;
		this.value = name;
	}
	private String value;    
    private String name;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
    
    
    
	
	
}
