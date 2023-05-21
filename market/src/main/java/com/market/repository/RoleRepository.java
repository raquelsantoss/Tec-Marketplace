package com.market.repository;

import org.springframework.data.repository.CrudRepository;

import com.market.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
