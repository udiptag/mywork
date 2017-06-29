package com.myapp.model;

public class Order {
	
	private String id;
	
	private String name;
	
	private Double price;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
