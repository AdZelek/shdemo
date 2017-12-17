package com.example.shdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.shdemo.domain.Car;
import com.example.shdemo.domain.Client;
import com.example.shdemo.domain.Person;
import com.example.shdemo.domain.Shoe;

@Component
@Transactional
public class SellingMangerHibernateImplShoe implements SellingManagerShoe {


	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		
//	@Override
//	public void addClient(Client client) {
//		//client.setId(null);
//		sessionFactory.getCurrentSession().persist(client);
//
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Client> getAllClients() {
//			return sessionFactory.getCurrentSession().getNamedQuery("client.all").list();
//		
//	}
//
//	@Override
//	public void deleteClient(Client client) {
//		client = (Client) sessionFactory.getCurrentSession().get(Client.class,
//				client.getId());
//		
////		// lazy loading here
////		for (Client client : shoe.getClient()) {
////			client.setSold(false);
////			sessionFactory.getCurrentSession().update(car);
////		}
//		sessionFactory.getCurrentSession().delete(client);
//		
//	}
//	
//	@Override
//	public Client findClientByNumberCart(int numberCart) {
//		return (Client) sessionFactory.getCurrentSession().getNamedQuery("client.byNumberCart").setInteger("numberCart", numberCart).uniqueResult();
//	}

	@Override
	public Long addShoe(Shoe shoe) {
		shoe.setId(null);
		return (Long) sessionFactory.getCurrentSession().save(shoe);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Shoe> getAllShoes() {
		return sessionFactory.getCurrentSession().getNamedQuery("shoe.all").list();
	}

	@Override
	public void deleteShoe(Shoe shoe) {
		shoe = (Shoe) sessionFactory.getCurrentSession().get(Shoe.class,
				shoe.getId());
		
//		// lazy loading here
//		for (Client client : shoe.getClient()) {
//			client.setSold(false);
//			sessionFactory.getCurrentSession().update(car);
//		}
		sessionFactory.getCurrentSession().delete(shoe);
		
	}

	@Override
	public Shoe findShoeBySize(int size) {
		return (Shoe) sessionFactory.getCurrentSession().getNamedQuery("shoe.bySize").setInteger("size", size).uniqueResult();
	}

}
