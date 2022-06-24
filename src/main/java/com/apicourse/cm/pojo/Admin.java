package com.apicourse.cm.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	int id;
	String FirstName;
	String LastName;
	String email;
	String password;
	public Admin() {
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(int id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
}
