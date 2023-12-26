package com.first.springDemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.first.springDemo.dao.UserDao;
import com.first.springDemo.mapper.UserMapperCls;
import com.first.springDemo.model.Users;
import com.first.springDemo.response.UserResponse;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private UserDao userDao;

	@Override
	public ResponseEntity<UserResponse>  getEmployee(Integer id) {

		Optional<Users> userOpt= userDao.getById(id);
		UserResponse userResponse= userOpt.map(UserMapperCls::toDto)
				.map(UserResponse::new)
				.orElseGet(() -> new UserResponse("No data found"));
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
				.body(userResponse);
	}
}
