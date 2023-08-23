package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="booktable")
public class Bookentity {
	@Id
	private int id;
	private String bname;
	private float price;
	private int q;
	private String aname;
	public Bookentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bookentity(int id, String bname, float price, int q, String aname) {
		super();
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.q = q;
		this.aname = aname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQ() {
		return q;
	}
	public void setQ(int q) {
		this.q = q;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
}