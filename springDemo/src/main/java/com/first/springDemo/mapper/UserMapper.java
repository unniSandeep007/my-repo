package com.first.springDemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.first.springDemo.dto.UserDTO;
import com.first.springDemo.model.Users;

@Mapper
public interface UserMapper {
	@Mapping(target = "id", source = "id")
	@Mapping(target = "firstName", source = "firstName")
	@Mapping(target = "lastName", source = "lastName")
	@Mapping(target = "role" , source = "role")
	@Mapping(target = "accessEnabled", source= "accessEnabled")
	@Mapping(target = "createdDate", source= "createdDate")
	UserDTO toDto(Users user);

}
