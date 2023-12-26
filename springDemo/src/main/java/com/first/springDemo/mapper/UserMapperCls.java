package com.first.springDemo.mapper;

import java.util.Optional;

import com.first.springDemo.dto.UserDTO;
import com.first.springDemo.model.Users;

public class UserMapperCls {
	
	 public static UserDTO toDto(Users user) {
	        UserDTO userDto = new UserDTO(null, null, null, null, null, null);
	        userDto.setId(user.getId());
	        userDto.setFirstName(user.getFirstName());
	        userDto.setLastName(user.getLastName());
	        userDto.setRole(user.getRole());
	        userDto.setAccessEnabled(user.getAccessEnabled());
	        userDto.setCreatedDate(user.getCreatedDate());
	        return userDto;
	        }

}
