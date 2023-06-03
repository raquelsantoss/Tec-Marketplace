package com.market.service;

import java.util.Optional;

import com.market.domain.UserPayment;

public interface UserPaymentService {
	Optional<UserPayment> findById(Long id);
	
	void removeById(Long id);
}
