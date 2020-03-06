package com.test.json;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.json.bean.User;

public class JSON_2_JavaPOJO {
	
	public static void main(String[] args) {
		
		
		ObjectMapper mapper = new ObjectMapper();

		try {
			//JSON from file to Object
			User user = mapper.readValue(new File("D:\\pojo2json.json"), User.class);
			System.out.println(user);
			
			//JSON from URL to Object
			user = mapper.readValue(new URL("http://localhost:8080/Test-JAX-RS/rest/user/getOneUserInJSON"), User.class);
			
			System.out.println(user);

			//JSON from String to Object
			String jsonInString = "{\"city\":{\"cityCode\":1,\"cityName\":\"LA\",\"country\":{\"countryCode\":\"+1\",\"countryName\":\"USA\"}},\"firstName\":\"Smith\",\"id\":3,\"lastName\":\"Gold\"}";
			user = mapper.readValue(jsonInString, User.class);
			System.out.println(user);
			
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
