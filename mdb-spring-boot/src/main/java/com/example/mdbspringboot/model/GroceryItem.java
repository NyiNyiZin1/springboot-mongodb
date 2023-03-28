package com.example.mdbspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("groceryitems")
public class GroceryItem {
	@Id
	private String id;
	private String name;
	private int quantity;
	private String category;

	public GroceryItem(String id, String name, int quantity, String category) {
		super();
		this.setId(id);
		this.setName(name);
		this.setQuantity(quantity);
		this.setCategory(category);
	}
}
