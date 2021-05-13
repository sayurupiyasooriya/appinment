package com.synotech.appoinmnet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synotech.appoinmnet.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

	 User findByEmail(String email);
}
