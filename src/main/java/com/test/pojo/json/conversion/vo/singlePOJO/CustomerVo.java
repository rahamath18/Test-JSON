package com.test.pojo.json.conversion.vo.singlePOJO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomerVo extends BaseVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String customerName;
	private String customerCode;
	protected String countryInformation;
	protected String cityInformation;

	public CustomerVo() {
	}

	public CustomerVo(Integer id, String customerName, String customerCode, String countryInformation,
			String cityInformation, String status, Integer version, String logicallyDeleted, String createdBy,
			Date createdDate, String updatedBy, Date updatedDate) {
		this.id = id;
		this.customerName = customerName;
		this.customerCode = customerCode;
		this.countryInformation = countryInformation;
		this.cityInformation = cityInformation;
		this.status = status;
		this.version = version;
		this.logicallyDeleted = logicallyDeleted;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCountryInformation() {
		return countryInformation;
	}

	public void setCountryInformation(String countryInformation) {
		this.countryInformation = countryInformation;
	}

	public String getCityInformation() {
		return cityInformation;
	}

	public void setCityInformation(String cityInformation) {
		this.cityInformation = cityInformation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		try {
			return new ObjectMapper().readValue(new ObjectMapper().writeValueAsString(this),
					new TypeReference<Map<String, String>>() {
					});
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String customerListToJSON(List<CustomerVo> aList) {
		try {
			return new ObjectMapper().writeValueAsString(aList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
