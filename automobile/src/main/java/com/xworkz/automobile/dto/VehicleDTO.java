package com.xworkz.automobile.dto;

public class VehicleDTO {
	
	public VehicleDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	private String color;
	private String type;
	private int model;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public VehicleDTO(String name, String color, String type, int model) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.model = model;
	}
	
	
	

}
