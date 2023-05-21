package com.market.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.domain.Book;
import com.market.repository.BookRepository;
import com.market.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findAll() {
		return (List<Book>) bookRepository.findAll();
	}
	
	@Override
	public Optional<Book> findById(Long id) {
		return bookRepository.findById(id);
	}


}
