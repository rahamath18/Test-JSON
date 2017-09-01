package com.test.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.json.bean.City;
import com.test.json.bean.Country;
import com.test.json.bean.User;

public class JSONDefaultPrettyPrinter {
	
	public static void main(String[] args) {
		
		User user = new User(2, "John", "Peter", new City(44, "Chennai", new Country("+91", "India")));
		
		ObjectMapper mapper = new ObjectMapper();

		try {
			
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}

}
