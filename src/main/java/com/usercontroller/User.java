package com.usercontroller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="users")
public class User {
	
	
	@Id
	String userid;
	@Column(name="password")
	
	String password;
	@Column(name="username")
	String username;
	@Column(name="dateofbirth")
	String dateofbirth;
	@Column(name="mobnumber")
	String mobnumber;
	@Column(name="address")
	String address;
	@Column(name="gender")
	String gender;
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Column(name="isadmin")
	String isadmin;
	
	
	
	


	protected User() {
	
	}
	
	
	public User(String userid, String password, String username, String dateofbirth, String mobnumber, String address,
			String gender, String isadmin) {
		super();
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.dateofbirth = dateofbirth;
		this.mobnumber = mobnumber;
		this.address = address;
		this.gender = gender;
		this.isadmin = isadmin;
	}
	
	
	
	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getDateofbirth() {
		return dateofbirth;
	}


	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}


	public String getMobnumber() {
		return mobnumber;
	}


	public void setMobnumber(String mobnumber) {
		this.mobnumber = mobnumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	

	
	public String getIsadmin() {
		return isadmin;
	}


	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}



}
