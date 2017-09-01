package com.test.json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.json.bean.User;
import com.test.json.dao.UserDao;

public class JavaPOJO_2_JSON {
	
	public static void main(String[] args) {
		
		
		ObjectMapper mapper = new ObjectMapper();
		List<User> aList = new UserDao().getAllUsers();

		try {
			//Object to JSON in file
			mapper.writeValue(new File("D:\\pojo_2_json.json"), aList);

			//Object to JSON in String
			String jsonInString = mapper.writeValueAsString(aList);
			
			System.out.println(jsonInString);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
