package com.example.shdemo.service;

import java.util.List;

import com.example.shdemo.domain.Car;
import com.example.shdemo.domain.Client;
import com.example.shdemo.domain.Person;
import com.example.shdemo.domain.Shoe;

public interface SellingManagerShoe {
	
//	void addClient(Client client);
//	List<Client> getAllClients();
//	void deleteClient(Client client);
//	Client findClientByNumberCart(int numberCart);
//	

	Long addShoe(Shoe shoe);
	List<Shoe> getAllShoes();
	void deleteShoe(Shoe shoe);
	Shoe findShoeBySize(int size);
	

}
