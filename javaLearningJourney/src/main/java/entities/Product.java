package main.java.entities;

public class Product {

	//attributes
	private String name;
	private Double price;

	//constructors
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	//gets and sets
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
	
	//methods
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}
}