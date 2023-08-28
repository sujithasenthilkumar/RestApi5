package com.day5.book.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.book.crud.model.Book;

public interface BookRepository extends 
JpaRepository<Book, Integer>{

}

