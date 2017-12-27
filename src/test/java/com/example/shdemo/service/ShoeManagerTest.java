package com.example.shdemo.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.example.shdemo.domain.Car;
import com.example.shdemo.domain.Client;
import com.example.shdemo.domain.Person;
import com.example.shdemo.domain.Shoe;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class ShoeManagerTest {

	@Autowired
	ShoeManager sm;
	
	private final String NAME_1 = "Nike 123";
	private final int SIZE_1 = 36;
	private final double PRICE_1 = 199.99;

	private final String NAME_2 = "Kalenji n34";
	private final String NAME_3 = "Kalenji n310";
	private final int SIZE_2 = 39;
	private final double PRICE_2 = 299.99;


	@Test
	public void addShoe() {
		Shoe shoe = new Shoe();
		shoe.setName(NAME_1);
		shoe.setPrice(PRICE_1);
		shoe.setSize(SIZE_1);
		
     Long shoeId = sm.addShoe(shoe);
     Shoe retrievedShoe= sm.findShoeById(shoeId );
     assertEquals(NAME_1, retrievedShoe.getName());
     assertEquals(SIZE_1, retrievedShoe.getSize());
     assertEquals(PRICE_1, retrievedShoe.getPrice(), 0.01);

	}
	
	@Test
    public void updateShoe() {

		Shoe shoe = new Shoe();
		shoe.setName(NAME_1);
		shoe.setPrice(PRICE_1);
		shoe.setSize(SIZE_1);
		
		sm.addShoe(shoe);
		
		Shoe newShoe = new Shoe();
		newShoe.setName(NAME_2);
		newShoe.setPrice(PRICE_2);
		newShoe.setSize(SIZE_2);
        
       Shoe retrievedShoe = sm.findShoeByName(NAME_1);
       sm.updateShoe(retrievedShoe, newShoe);

        assertEquals(NAME_2, retrievedShoe.getName());
        assertEquals(PRICE_2, retrievedShoe.getPrice(), 0.01);
        assertEquals(SIZE_2, retrievedShoe.getSize());

	}
	
	
	@Test
    public void deleteShoe() {
     
		Shoe shoe = new Shoe();
		shoe.setName(NAME_3);
		shoe.setPrice(PRICE_2);
		shoe.setSize(SIZE_2);
		sm.addShoe(shoe);

		Shoe retrievedShoe= sm.findShoeByName(NAME_3);
        sm.deleteShoe(retrievedShoe);
    	List<Shoe> retrievedShoes= sm.getAllShoes();
    	
        assertEquals(0, retrievedShoes.size());
       }
	
	


}
