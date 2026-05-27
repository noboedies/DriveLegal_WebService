package com.tausif.drivelegal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private String email;
	private String name;
	private String phone;
	private int noOfVehicles;
	private String vehicleNumber;
	private String password;
	@Column(nullable = true, columnDefinition = "longblob")
	private byte[] image;
	private String state;
	private String city;
	private String pinCode;
}
