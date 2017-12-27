package com.example.shdemo.service;

import java.util.List;

import com.example.shdemo.domain.Car;
import com.example.shdemo.domain.Client;
import com.example.shdemo.domain.Person;
import com.example.shdemo.domain.Shelf;
import com.example.shdemo.domain.Shoe;

public interface ShoeManager {
	
	Long addShoe(Shoe shoe);
	List<Shoe> getAllShoes();
	void deleteShoe(Shoe shoe);
	void updateShoe(Shoe oShoe, Shoe nShoe);
	
	Shoe findShoeByName(String name);
	Shoe findShoeById(Long id);
	void addShoeShelf(Shelf shelf); 

}
