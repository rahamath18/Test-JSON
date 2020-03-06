package com.test.json.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	private City city;
	
	public User() {}
	
	public User(Integer id, String firstName, String lastName, City city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	@Override
	public String toString() {

		return "User:(" + "id=" + this.id + "|" + "firstName=" + this.firstName + "|" + "lastName=" + this.lastName + "|" + this.city+ ")";

	}

}
