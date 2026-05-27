package com.tausif.drivelegal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {

	@Id
	private String email;
	private String name;
	private String designation;
	private String phone;
	private String state;
	private String password;
	@Column(nullable = true, columnDefinition =  "longblob")
	private byte[] profile;
}
