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

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:/beans.xml" })
//@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
//@Transactional
public class ShoeManagerTest {

//	@Autowired
//	SellingManagerShoe sm;
//	
//	private final String NAME_1 = "Bolek";
//	private final int PIN_1 = 1234;
//
//	private final String NAME_2 = "Lolek";
//	private final int PIN_2 = 4321;
//
//	private final String MODEL_1 = "126p";
//	private final String MAKE_1 = "Fiat";
//
//	private final String MODEL_2 = "Mondeo";
//	private final String MAKE_2 = "Ford";
//
//	@Test
//	public void addClientCheck() {
//
//		List<Client> retrievedClients = sm.getAllClients();
//
//		// If there is a client with PIN_1 delete it
//		for (Client client : retrievedClients) {
//			if (client.getNumberCart() == PIN_1 ) {
//				sm.deleteClient(client);
//			}
//		}
//
//		Client client = new Client();
//		client.setFirstName(NAME_1);
//		client.setNumberCart(PIN_1);
//		// ... other properties here
//
//		// Pin is Unique
//		sm.addClient(client);
//
//		Client retrievedClient = sm.findClientByNumberCart(PIN_1);
//
//		assertEquals(NAME_1, retrievedClient.getFirstName());
//		assertEquals(PIN_1, retrievedClient.getNumberCart());
//		// ... check other properties here
//	}
//
////	@Test
////	public void addCarCheck() {
////
////		Car car = new Car();
////		car.setMake(MAKE_1);
////		car.setModel(MODEL_1);
////		// ... other properties here
////
////		Long carId = sm.addNewCar(car);
////
////		Car retrievedCar = sm.findCarById(carId);
////		assertEquals(MAKE_1, retrievedCar.getMake());
////		assertEquals(MODEL_1, retrievedCar.getModel());
////		// ... check other properties here
////
////	}
////
////	@Test
////	public void sellCarCheck() {
////
////		Person person = new Person();
////		person.setFirstName(NAME_2);
////		person.setPin(PIN_2);
////
////		sm.addClient(person);
////
////		Person retrievedPerson = sm.findClientByPin(PIN_2);
////
////		Car car = new Car();
////		car.setMake(MAKE_2);
////		car.setModel(MODEL_2);
////
////		Long carId = sm.addNewCar(car);
////
////		sm.sellCar(retrievedPerson.getId(), carId);
////
////		List<Car> ownedCars = sm.getOwnedCars(retrievedPerson);
////
////		assertEquals(1, ownedCars.size());
////		assertEquals(MAKE_2, ownedCars.get(0).getMake());
////		assertEquals(MODEL_2, ownedCars.get(0).getModel());
////	}
////
////	// @Test -
////	public void disposeCarCheck() {
////		// Do it yourself
////	}

}
