package com.example.mdbspringboot.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.example.mdbspringboot.model.GroceryItem;
import com.mongodb.client.result.UpdateResult;

@Component
public class CustomItemRepositoryImp implements CustomItemRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public void updateItemQuantity(String name, float newQuantity) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("name").is(name));
		Update update = new Update();
		update.set("quantity", newQuantity);
		
		UpdateResult result = mongoTemplate.updateFirst(query, update, GroceryItem.class);
		if(result == null)
            System.out.println("No documents updated");
        else
            System.out.println(result.getModifiedCount() + " document(s) updated..");
		
	}

	@Override
	public void updateItemName(float quantity, String name) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("quantity").is(quantity));
		Update update = new Update();
		update.set("name", name);
		
		UpdateResult result = mongoTemplate.updateFirst(query, update, GroceryItem.class);
		if(result == null)
            System.out.println("No documents updated");
        else
            System.out.println(result.getModifiedCount() + " document(s) updated..");
		
	}

}
