package com.market.repository;

import org.springframework.data.repository.CrudRepository;

import com.market.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
