package com.example.shdemo.domain;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "shoe.all", query = "Select s from Shoe s"),
	@NamedQuery(name="shoe.deleteAll", query="Delete from Shoe"),
	@NamedQuery(name = "shoe.byName", query = "Select s from Shoe s where s.name = :name")
	
})
	public class Shoe {
		
		private Long Id; 
		private String name;
		private int size;
		private double price;
		private Shelf shelf;
		
		
		public Shoe() {};
		
		public Shoe(String name, int size, double price, Shelf shelf) {
			//super();
			this.name = name;
			this.size = size;
			this.price = price;
				this.shelf = shelf; 
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
		
		@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		public Shelf getShelf() {
			return shelf;
		}
		public void setShelf(Shelf shelf) {
			this.shelf = shelf;
		}
		
	}
