package com.example.mdbspringboot.repository;

public interface CustomItemRepository {
	
	void updateItemQuantity(String name, float newQuantity);
	
	void updateItemName(float quantity, String name);

}
