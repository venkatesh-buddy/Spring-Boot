package com.boot.book.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.boot.book.entity.Book;

public interface BookStoreRepository extends MongoRepository<Book, Integer> {

}
