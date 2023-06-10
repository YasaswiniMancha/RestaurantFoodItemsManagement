package com.example.fooditems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fooditems.entity.FoodItem;
import com.example.fooditems.repo.FoodItemRepository;

@Service
public class FoodItemDaoImpl implements FoodItemDao {

	private FoodItemRepository foodRepository;

	@Autowired
	public FoodItemDaoImpl(FoodItemRepository foodRepository) {
		this.foodRepository = foodRepository;
	}
	

	@Override
	public Integer getItemNumber() {
	   Integer id;
	   if(foodRepository.getItemId() == null)
           id=546;
		else
			id=foodRepository.getItemId()+1;
	   return id;   
	}
	
	@Override
	public List<FoodItem> showAllItems() {
		return foodRepository.findAll();
	}

	@Override
	public void saveItem(FoodItem foodList) {
		foodRepository.save(foodList);
	}

	@Override
	public void deleteItem(Integer id) {
		foodRepository.deleteById(id);

	}

	@Override
	public FoodItem getDetails(Integer id) {
		return foodRepository.findById(id).get();
	}

	
	
	
}
