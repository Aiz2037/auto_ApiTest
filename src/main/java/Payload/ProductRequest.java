package Payload;

import java.util.HashMap;

public class ProductRequest {

	private String name;
	private String price;
	private String brand;
	private String inventory;
	private HashMap<String, String> category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getInventory() {
		return inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}
	public HashMap<String, String> getCategory() {
		return category;
	}
	public void setCategory(HashMap<String, String> category) {
		this.category = category;
	}




}
