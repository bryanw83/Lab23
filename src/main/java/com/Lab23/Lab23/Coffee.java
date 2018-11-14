package com.Lab23.Lab23;

public class Coffee {
	
	private String name;
	private String description;
	private int quantity;
	private double price;
	private int id;
	
	public Coffee() {
		
	}

	public Coffee(String name, String description, int quantity, double price) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Coffee(String name, String description, int quantity, double price, int id) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", description=" + description + ", quantity=" + quantity + ", price=" + price
				+ ", id=" + id + "]";
	}
	
	

}
