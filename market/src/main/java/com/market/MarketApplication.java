package com.market;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.market.domain.User;
import com.market.domain.security.Role;
import com.market.domain.security.UserRole;
import com.market.service.UserService;
import com.market.utility.SecurityUtility;

@SpringBootApplication
public class MarketApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Diego");
		user1.setLastName("Dias");
		user1.setUsername("d");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("diegodias@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
	}
}