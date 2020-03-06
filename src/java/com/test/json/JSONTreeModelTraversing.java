package com.test.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONTreeModelTraversing {
	
	public static void main(String[] args) {
		
		try {

			ObjectMapper mapper = new ObjectMapper();
			
			//JsonNode root = mapper.readTree(new File("D:\\user.json"));
			JsonNode root = mapper.readTree(JSONTreeModelTraversing.class.getResourceAsStream("resources/user.json"));

			// Get id
			long id = root.path("id").asLong();
			System.out.println("id : " + id);

			// Get city
			JsonNode cityNode = root.path("city");
			System.out.println(cityNode.elements());
			if(cityNode.isNull() || cityNode.toString().isEmpty())
				System.out.println("city nide is missing or not in root path");
			
			if (cityNode.isArray()) {
				System.out.println("This node is an array. Use java.util.List to process");
			}

			for (JsonNode node : cityNode) {
				System.out.println("cityCode : " + node.path("cityCode").asText());
				System.out.println("cityName : " + node.path("cityName").asText());
			}

			// Get country
			JsonNode countryNode = root.path("country");
			if(countryNode.isNull() || countryNode.toString().isEmpty())
				System.out.println("country node is missing or not in root path");
			
			if (countryNode.isArray()) {
				System.out.println("This node is an array. Use java.util.List to process");
			}

			for (JsonNode node : countryNode) {
				System.out.println("countryCode : " + node.path("countryCode").asText());
				System.out.println("countryName : " + node.path("countryName").asText());
			}
			
			// Get telephone
			JsonNode nameNode = root.path("telephone");
			if (nameNode.isMissingNode()) {
				System.out.println("telephone nide is missing");
			} else {

				System.out.println("office : " + nameNode.path("office").asText());
				System.out.println("fax : " + nameNode.path("fax").asText());
				System.out.println("mobile : " + nameNode.path("mobile").asText());

			}

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
