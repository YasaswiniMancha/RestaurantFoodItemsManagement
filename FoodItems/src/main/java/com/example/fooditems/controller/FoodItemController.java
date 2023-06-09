package com.example.fooditems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.fooditems.dao.FoodItem;
import com.example.fooditems.service.FoodItemDao;


@RestController
public class FoodItemController {
	
	@Autowired
	private FoodItemDao foodItemDao;
	

	@GetMapping("/homepage")
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView("homepage");
        mv.addObject("foodList",foodItemDao.showAllItems());
		return mv;
		
	}
	
	@GetMapping("/deleteitem")
	public ModelAndView deleteItem(@RequestParam Integer id) {
		ModelAndView mv = new ModelAndView("redirect:/homepage");
		foodItemDao.deleteItem(id);
		return mv;	
	}

	@GetMapping("/insertItemsPage")
    public ModelAndView addDetails() {
		ModelAndView mv = new ModelAndView("insertItemsPage");
		 mv.addObject("id",foodItemDao.getItemNumber());
		return mv;	
    }
    
	
	
	@PostMapping("/addingitem")
	public ModelAndView display(@ModelAttribute FoodItem foodList) {
		ModelAndView mv = new ModelAndView("redirect:/homepage");
	    foodItemDao.saveItem(foodList);
		return mv;
	}
	
	
	@GetMapping("/editItemPage")
    public ModelAndView updateDetails(@RequestParam Integer id) {
		ModelAndView mv = new ModelAndView("editItemPage");
		 mv.addObject("foodItem", foodItemDao.getDetails(id));
		return mv;	
    }
	
	@PostMapping("/updatingitem")
    public ModelAndView update(@ModelAttribute FoodItem foodItem) {
		foodItemDao.saveItem(foodItem);
		ModelAndView mv = new ModelAndView("redirect:/homepage");
		return mv;
	}
	

}