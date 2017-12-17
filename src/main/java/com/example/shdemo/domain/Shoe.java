package com.example.shdemo.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
	@NamedQuery(name = "shoe.All", query = "Select s from Shoe s"),
	@NamedQuery(name="shoe.deleteAll", query="Delete from Shoe"),
	@NamedQuery(name = "shoe.findBySize", query = "Select s from Shoe s where s.size = :size")
	
})
	public class Shoe {
		
		private Long Id; 
		private String name;
		private int size;
		private double price;
		private Collection<Client> clients = new ArrayList<>();
		
		public Shoe() {};
		
		public Shoe(String name, int size, double price, Collection<Client> clients) {
			//super();
			this.name = name;
			this.size = size;
			this.price = price;
			this.clients = clients;
		}
		
		@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		 public Collection<Client> getClients() {
				return clients;
			}
			public void setClients(Collection<Client> clients) {
				this.clients = clients;
			}

		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY) 
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		
		@Column(unique = true, nullable = false)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}
