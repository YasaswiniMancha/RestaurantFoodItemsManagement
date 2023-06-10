package com.example.fooditems.entity;

import javax.persistence.*;

@Entity
@Table(name="legourmet")
public class FoodItem {
    
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

	private Integer itemNumber;
	private String itemName;
	private String cuisine;
	private String price;
	private String availability;
	public Integer getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "FoodItem [itemNumber=" + itemNumber + ", itemName=" + itemName + ", cuisine=" + cuisine + ", price="
				+ price + ", availability=" + availability + "]";
	}

	
    
	
}
