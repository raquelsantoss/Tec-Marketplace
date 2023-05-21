package com.market.repository;


import org.springframework.data.repository.CrudRepository;

import com.market.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}


