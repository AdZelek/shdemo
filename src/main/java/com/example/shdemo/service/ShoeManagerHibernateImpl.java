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
import com.example.shdemo.domain.Shelf;
import com.example.shdemo.domain.Shoe;

@Component
@Transactional
public class ShoeManagerHibernateImpl implements ShoeManager {


	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		
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
		shoe = (Shoe) sessionFactory.getCurrentSession().get(Shoe.class,shoe.getId());
		sessionFactory.getCurrentSession().delete(shoe);
		
	}

	@Override
	public Shoe findShoeByName(String name) {
		return (Shoe) sessionFactory.getCurrentSession().getNamedQuery("shoe.byName").setString("name", name).uniqueResult();
	}

	
	@Override
	public void addShoeShelf(Shelf shelf) {

	}

	@Override
	public void updateShoe(Shoe oShoe, Shoe nShoe) {
		oShoe = (Shoe) sessionFactory.getCurrentSession().get(Shoe.class, oShoe.getId());
		oShoe.setName(nShoe.getName());
		oShoe.setPrice(nShoe.getPrice());
		oShoe.setSize(nShoe.getSize());
		sessionFactory.getCurrentSession().update(oShoe);
		
	}
	@Override
	public Shoe findShoeById(Long id) {
		return (Shoe) sessionFactory.getCurrentSession().get(Shoe.class, id);
	}

}
