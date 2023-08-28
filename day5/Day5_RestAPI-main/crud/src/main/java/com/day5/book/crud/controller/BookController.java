package com.day5.book.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.book.crud.model.Book;
import com.day5.book.crud.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	@PostMapping("/add")
	
	public Book add(@RequestBody Book book)
	{
		return bookService.add(book);
	}
	
	@PostMapping("/addbooks")
	   public List<Book> addBooks(@RequestBody List<Book> book)
	   {
		   return bookService.addBooks(book);
	   }
	
	@GetMapping("/showbooks")
	public List<Book> showBooks(){
		return bookService.showBooks();
	}
	
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	/*@PutMapping("updatebyid/{id}")
	public String updateById(@PathVariable int id,@RequestBody Book book) {
		return bookService.updateById(id,book);
	}*/
	
	@DeleteMapping("deletebook")
	public String deleteBook(@RequestBody Book book){
		   bookService.deleteBook(book);
		   return "deleted successfully";
	   }
	
	 @DeleteMapping("deletebyid/{id}")
	 public void deleteById(@PathVariable int id){
		   bookService.deleteById(id);
	   }

}
