package com.test.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JSONFileToMap {
	
	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();

			// read JSON from a file
			Map<String, Object> map = mapper.readValue(JSONTreeModelTraversing.class.getResourceAsStream("resources/user.json"),
					new TypeReference<Map<String, Object>>() {
			});

			System.out.println(map.get("id"));
			System.out.println(map.get("firstName"));

			@SuppressWarnings("unchecked")
//			ArrayList<String> list = (ArrayList<String>) map.get("city");
			LinkedHashMap<Integer,Integer> list = (LinkedHashMap<Integer,Integer>) map.get("city");

			System.out.println(list);
			
//			list.forEach((Integer x, Integer y) -> {
//			      System.out.println(x);
//			      System.out.println(y);
//			    });

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
