package com.test.json.dao;

import java.util.Arrays;
import java.util.List;

import com.test.json.bean.City;
import com.test.json.bean.Country;
import com.test.json.bean.User;

public class UserDao {
	
	public List<User> getAllUsers() {

		List<User> aList = Arrays.asList(
				new User(1, "Rahamath", "S", new City(80, "Bangalore", new Country("+91", "India"))), 
				new User(2, "John", "Peter", new City(44, "Chennai", new Country("+91", "India"))),
				new User(3, "Smith", "Gold", new City(1, "LA", new Country("+1", "USA")))
				);
		
	    return aList;
		
	}
	
}
