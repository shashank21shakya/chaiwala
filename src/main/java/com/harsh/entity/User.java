package com.harsh.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	private String email;
	private String password;
	
	@OneToOne(fetch=FetchType.EAGER ,cascade=CascadeType.ALL)
	private Address address;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<PhoneNumber> mobile;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Address getAddress() {
		return address;
	}

	public List<PhoneNumber> getMobile() {
		return mobile;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setMobile(List<PhoneNumber> mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
