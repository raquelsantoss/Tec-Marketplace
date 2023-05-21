package com.market.service;

import java.util.List;
import java.util.Optional;

import com.market.domain.Book;

public interface BookService {
	List<Book> findAll ();
	
	Optional<Book> findById(Long id);
}
