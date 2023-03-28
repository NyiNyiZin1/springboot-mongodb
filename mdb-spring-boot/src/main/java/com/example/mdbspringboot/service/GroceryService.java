package com.example.mdbspringboot.service;

import com.example.mdbspringboot.model.GroceryItem;

public interface GroceryService {
	 void createGroceryItems();
	 void showAllGroceryItems();
	 void getGroceryItemByName(String name);
	 void getItemsByCategory(String category);
	 void findCountOfGroceryItems();
	 void updateCategoryName(String category);
	 void deleteGroceryItem(String id);
	 String getItemDetails(GroceryItem item);
	 void updateItemQuantity(String name, float newQuantity);
	 void updateItemName(float quantity,String name);
}
