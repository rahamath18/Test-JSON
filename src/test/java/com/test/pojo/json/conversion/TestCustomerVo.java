package com.test.pojo.json.conversion;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.test.pojo.json.conversion.vo.singlePOJO.CustomerVo;

public class TestCustomerVo {

	public static void main(String[] args) {
		
		CustomerVo customerVo = new CustomerVo(1, "ABCD PTE LTD", "ABCD",
				"{\"key_1\":\"value_1\",\"key_2\":\"value_2\"}",
				"{\"key_1\":\"value_1\",\"key_2\":\"value_2\"}", "ACTIVE", 1,
				"N", "SYSADMIN", new Date(), "APPADMIN", new Date());

		System.out.println("VO to JSON (String).......");
		System.out.println(customerVo);

		System.out.println("VO to JSON (Map).......");
		System.out.println(customerVo.toMap());

		List<CustomerVo> aList = Arrays.asList(
				new CustomerVo(1, "ABCD PTE LTD", "ABCD",
						"{\"key_1\":\"value_1\",\"key_2\":\"value_2\"}",
						"{\"key_1\":\"value_1\",\"key_2\":\"value_2\"}",
						"ACTIVE", 1, "N", "SYSADMIN", new Date(), "APPADMIN", new Date()),
				new CustomerVo(2, "XYZ PTE LTD", "XYZ",
						"{\"key_1\":\"value_1\",\"key_2\":\"value_2\"}",
						"{\"key_1\":\"value_1\",\"key_2\":\"value_2\"}",
						"ACTIVE", 1, "N", "SYSADMIN", new Date(), "APPADMIN", new Date()));

		System.out.println("VO to JSON Customer List To JSON (String).......");
		System.out.println(CustomerVo.customerListToJSON(aList));

	}

}
