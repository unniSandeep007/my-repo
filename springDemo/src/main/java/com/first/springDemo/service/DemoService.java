package com.first.springDemo.service;

import org.springframework.http.ResponseEntity;

import com.first.springDemo.response.UserResponse;

public interface DemoService {
	
	ResponseEntity<UserResponse> getEmployee(Integer id);	

}
