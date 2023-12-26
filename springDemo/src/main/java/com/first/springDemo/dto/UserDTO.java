package com.first.springDemo.dto;

import java.sql.Date;


public class UserDTO {

	private Integer id;
	private String firstName;
	private String lastName;
	private String role;
	private String accessEnabled;
	private Date createdDate;

	public UserDTO(Integer id, String firstName, String lastName, String role, String accessEnabled, Date createdDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.accessEnabled = accessEnabled;
		this.createdDate = createdDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAccessEnabled() {
		return accessEnabled;
	}
	public void setAccessEnabled(String accessEnabled) {
		this.accessEnabled = accessEnabled;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role
				+ ", accessEnabled=" + accessEnabled + ", createdDate=" + createdDate + "]";
	}

}
