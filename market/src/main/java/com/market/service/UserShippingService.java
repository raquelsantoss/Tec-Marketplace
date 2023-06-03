package com.market.service;

import java.util.Optional;

import com.market.domain.UserShipping;

public interface UserShippingService {
	Optional<UserShipping> findById(Long id);
	
	void removeById(Long id);
}
