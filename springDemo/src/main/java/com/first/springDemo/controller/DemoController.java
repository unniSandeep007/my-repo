package com.first.springDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.first.springDemo.response.UserResponse;
import com.first.springDemo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	DemoService demoService;

	@GetMapping(value = "getEmployee/{id}", produces = "application/json")
	public ResponseEntity<UserResponse> getEmployee(@PathVariable Integer id) {
		return demoService.getEmployee(id);

	}
}
