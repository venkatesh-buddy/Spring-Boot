package com.boot.book.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.book.entity.Book;
import com.boot.book.repository.BookStoreRepository;

@RestController
public class BookController {

	@Autowired
	private BookStoreRepository bookRepository;
	
	//http://localhost:8080/addBook
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book){
		bookRepository.save(book);
		return "Book added with id::"+book.getId();
	}
	
	//http://localhost:8080/book/580
	@GetMapping("/book/{id}")
	public Optional<Book> findBook(@PathVariable int id){
		return bookRepository.findById(id);
	}
	
	//http://localhost:8080/delete/580
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id){
		bookRepository.deleteById(id);
		return "Book with id "+id+" is deleted";
	}
}
