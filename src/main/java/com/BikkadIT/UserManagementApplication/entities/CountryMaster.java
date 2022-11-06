package com.BikkadIT.UserManagementApplication.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "COUNTRY_MASTER")
public class CountryMaster {

	@Id
	@Column(name="COUNTRY_ID")
	private Integer countryId;
	
	@Column(name="COUNTRY_NAME")
	private String countryName;
	
	@Column(name="COUNTRY_CODE")
	private String countryCode; 
	
}
