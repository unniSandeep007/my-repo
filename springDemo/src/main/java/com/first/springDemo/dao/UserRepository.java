package com.first.springDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.springDemo.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
