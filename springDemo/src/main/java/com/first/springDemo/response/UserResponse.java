package com.first.springDemo.response;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.first.springDemo.dto.UserDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse {
	private Integer id;
	private String firstName;
	private String lastName;
	private String role;
	private String accessEnabled;
	private Date createdDate;
	private String message;  // Additional field for a custom message


	public UserResponse(UserDTO userDTO) {
		this.id = userDTO.getId();
		this.firstName = userDTO.getFirstName();
		this.lastName = userDTO.getLastName();
		this.role = userDTO.getRole();
		this.accessEnabled = userDTO.getAccessEnabled();
		this.createdDate = userDTO.getCreatedDate();
	}

	// Constructor for no data found
	public UserResponse(String message) {
		this.message = message;
	}

}
