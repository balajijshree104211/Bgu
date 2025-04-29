package com.samsung.mobiles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobiletable")
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Mobile(Long i, String brand, String model, Integer price) {
		super();
		this.id = i;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	private String brand;
	private String model;
	private Integer price;
	public Long getId() {
		return id;
	}
	public Mobile() {
		super();
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
}
