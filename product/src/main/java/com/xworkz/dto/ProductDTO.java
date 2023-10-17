package com.xworkz.dto;

public class ProductDTO {
	
	private String name;
	private String type;
	private String price;
	private String brand;
	private String quantity;
	private String desc;
	
	
	
	
	public ProductDTO(String name, String type, String price, String brand, String quantity, String desc) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.brand = brand;
		this.quantity = quantity;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
