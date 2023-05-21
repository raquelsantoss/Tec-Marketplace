package com.market.repository;

import org.springframework.data.repository.CrudRepository;

import com.market.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
}
