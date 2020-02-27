package com.test.pojo.json.conversion;

import java.util.Arrays;
import java.util.List;

import com.test.pojo.json.conversion.vo.parent_child_POJO.CityVo;
import com.test.pojo.json.conversion.vo.parent_child_POJO.CountryVo;
import com.test.pojo.json.conversion.vo.parent_child_POJO.UserVo;

public class TestUserVo {

	public static void main(String[] args) {

		UserVo userVo = new UserVo(1, "John", "Miller", new CityVo("NY", "New York", new CountryVo("US", "USA")));

		System.out.println("VO to JSON (String).......");
		System.out.println(userVo);
		
		System.out.println("VO to JSON (Map).......");
		System.out.println(userVo.toMap());

		List<UserVo> aList = Arrays.asList(
				new UserVo(1, "John", "Miller", new CityVo("NY", "New York", new CountryVo("US", "USA"))),
				new UserVo(1, "John", "Miller", new CityVo("NY", "New York", new CountryVo("US", "USA"))),
				new UserVo(1, "John", "Miller", new CityVo("NY", "New York", new CountryVo("US", "USA")))
				);

		System.out.println("VO to JSON User List To JSON (String).......");
		System.out.println(UserVo.userListToJSON(aList));

	}

}
