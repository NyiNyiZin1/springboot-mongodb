package com.example.mdbspringboot.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mdbspringboot.service.GroceryService;

@RestController
@RequestMapping("/grocery")
public class GroceryController {
	@Autowired
	private GroceryService groceryService;

	@PostMapping
	public void createGroceryItems() {
		groceryService.createGroceryItems();
	}

	@GetMapping
	public void showAllGroceryItems() {
		groceryService.showAllGroceryItems();
	}

	@GetMapping("/groceryItem/{name}")
	public void getGroceryItemByName(@PathParam("name")String name) {
		groceryService.getGroceryItemByName(name);
	}

	@GetMapping("/items/{category}")
	public void getItemsByCategory(@PathParam("category")String category) {
		groceryService.getItemsByCategory(category);
	}

	@PutMapping("/category")
	public void updateCategoryName() {
		groceryService.updateCategoryName("snacks");
	}

	@DeleteMapping
	public void deleteGroceryItem() {
		groceryService.deleteGroceryItem("Kodo Millet");
	}

	@GetMapping("/countGroceryItems")
	public void findCountOfGroceryItems() {
		groceryService.findCountOfGroceryItems();
	}

	@PutMapping("/itemQuantity")
	public void updateItemQuantity() {
		groceryService.updateItemQuantity("Whole Wheat Biscuit", 28);
	}

	@PutMapping("/itemName")
	public void updateItemName() {
		groceryService.updateItemName(1, "Bonny Cheese Crackers NY");
	}

}
