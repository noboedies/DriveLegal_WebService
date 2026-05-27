package com.tausif.drivelegal.entity;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Violation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private Time time;
	private String vehicleNo;
	@Column(nullable = false, columnDefinition = "longblob")
	private byte[] image;
	private String penalty;
	private String RTO;
	private String latitude;
	private String longitude;
	
	@ManyToOne
	private User user;

}
