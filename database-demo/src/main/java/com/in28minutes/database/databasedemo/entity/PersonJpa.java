package com.in28minutes.database.databasedemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person") 
public class PersonJpa {
	
	@Id // To specify the Primary Key
	@GeneratedValue // To Auto generate the id values by Hibernate
	private int id;
	
	//@Column(name = "name") - Column name matches already
	private String name;
	private String location;
	
	public PersonJpa() {
		
	}
	
	public PersonJpa(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public PersonJpa(String name, String location) {
		super();
		this.name = name;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
}
