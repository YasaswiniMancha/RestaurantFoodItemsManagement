package com.example.fooditems.service;
import java.util.List;

import com.example.fooditems.entity.FoodItem;


public interface FoodItemDao {

	public Integer getItemNumber();

	public List<FoodItem> showAllItems();

	public void saveItem(FoodItem foodList);

	public void deleteItem(Integer id);

	public FoodItem getDetails(Integer id);

}

