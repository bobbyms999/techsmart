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

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Student [contactNo=" + contactNo + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber
				+ ", emailAddress=" + emailAddress + ", message=" + message + "]";
	}
}
