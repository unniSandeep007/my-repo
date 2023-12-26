package com.first.springDemo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.first.springDemo.model.Users;

@Repository
public class UserDao {

	@Autowired
	UserRepository userRepository;


	public Optional<Users> getById(Integer id) {

		/*
		 * Optional<Users> user=
		 * Optional.ofNullable(userRepository.getReferenceById(id));
		 */		 
		Optional<Users> user = userRepository.findById(id);
		return user;
	}



}
