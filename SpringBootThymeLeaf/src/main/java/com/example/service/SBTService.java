package com.example.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Fruit;

@Component
public class SBTService {
	
	public List<Fruit> loadFruits(List<Fruit> fruits) {
		Fruit fruit1 = new Fruit();
		fruit1.setName("apple");
		fruit1.setCost(0.49);
		fruit1.setUrl("https://images-na.ssl-images-amazon.com/images/I/81xQBb5jRzL._SY355_.jpg");
		fruits.add(fruit1);
		
		Fruit fruit2 = new Fruit();
		fruit2.setName("orange");
		fruit2.setCost(0.40);
		fruit2.setUrl("https://images-na.ssl-images-amazon.com/images/I/51TcdS9z2fL._SY300_QL70_.jpg");
		fruits.add(fruit2);
		
		Fruit fruit3 = new Fruit();
		fruit3.setName("banana");
		fruit3.setCost(0.55);
		fruit3.setUrl("https://images-na.ssl-images-amazon.com/images/I/71gI-IUNUkL._SY355_.jpg");
		fruits.add(fruit3);
		
		return fruits;
	}

}
