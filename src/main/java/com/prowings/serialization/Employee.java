package com.prowings.serialization;

import java.io.Serializable;

public class Employee extends Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private transient String country = "India";
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
