package com.techsmart.learn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "contact_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int contactNo;
	@Column(name = "full_nm")
	protected String fullName;
	@Column(name = "phone_number")
	protected String phoneNumber;
	@Column(name = "email_address")
	protected String emailAddress;
	protected String message;

}
