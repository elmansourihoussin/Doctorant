package com.elmansouri.doctorant.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity
public class Contact implements Serializable {

	   
	@Id
	private String id;
	private String name;
	private String lastName;
	private String avatar;
	private String nickname;
	private String company;
	private String jobTitle;
	private String email;
	private String phone;
	private String address;
	private String brirthday;
	private String notes;
	private static final long serialVersionUID = 1L;

	public Contact() {
		super();
	}   
	
	//Getters Setters
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}   
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}   
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}   
	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getBrirthday() {
		return this.brirthday;
	}

	public void setBrirthday(String brirthday) {
		this.brirthday = brirthday;
	}   
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
   
}
