package com.alexa.bank.apps.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String occupation;
	private String dateOfBirth;
	private String firstName;
	private String lastName;
	private String identificationMark;
	private String contactNo;
	private String emailId;
	private String aadharNo;
	private String panNo;
	private String address;
	private String uname;
	private String password;
	private String gender;
	private String fatherName;
	private String motherName;
	
	@OneToMany(cascade = CascadeType.DETACH)
	@JoinColumn(name ="c_r_id")
	private List<Role> role = new ArrayList<Role>();
	

}
