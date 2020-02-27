package com.test.pojo.json.conversion.vo.parent_child_POJO;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserVo implements Serializable {

	protected static final long serialVersionUID = 1L;

	protected Integer id;
	protected String firstName;
	protected String lastName;
	protected CityVo city;

	public UserVo() {
	}

	public UserVo(Integer id, String firstName, String lastName, CityVo city) {
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

	public CityVo getCity() {
		return city;
	}

	public void setCity(CityVo city) {
		this.city = city;
	}

	@Override
	public String toString() {
		try {
			return new ObjectMapper().writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Map<String, String> toMap() {
		//TODO
		return null;
	}

	public static String userListToJSON(List<UserVo> aList) {
		try {
			return new ObjectMapper().writeValueAsString(aList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
