package com.test.json;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.json.bean.User;

public class JSONArray_2_JavaList {
	
	public static void main(String[] args) {
		
		String jsonArray = "[{\"city\":{\"cityCode\":80,\"cityName\":\"Bangalore\",\"country\":{\"countryCode\":\"+91\",\"countryName\":\"India\"}},\"firstName\":\"Rahamath\",\"id\":1,\"lastName\":\"S\"},{\"city\":{\"cityCode\":44,\"cityName\":\"Chennai\",\"country\":{\"countryCode\":\"+91\",\"countryName\":\"India\"}},\"firstName\":\"John\",\"id\":2,\"lastName\":\"Peter\"},{\"city\":{\"cityCode\":1,\"cityName\":\"LA\",\"country\":{\"countryCode\":\"+1\",\"countryName\":\"USA\"}},\"firstName\":\"Smith\",\"id\":3,\"lastName\":\"Gold\"}]";
		
		ObjectMapper mapper = new ObjectMapper();

		try {
			
			List<User> list = mapper.readValue(jsonArray, new TypeReference<List<User>>(){});
			
			//list.forEach(System.out::println);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
