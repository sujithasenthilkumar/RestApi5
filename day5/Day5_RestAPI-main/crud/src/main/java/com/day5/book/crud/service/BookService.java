package com.day5.book.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.book.crud.model.Book;
import com.day5.book.crud.repository.BookRepository;
@Service
public class BookService {
	
	@Autowired
	BookRepository bookrepository;
	public Book add(Book book){
	   return bookrepository.save(book);
	}
	 
	public List<Book> addBooks(List<Book> book){
		 return bookrepository.saveAll(book);
	  }
	public List<Book> showBooks() {
		
		return bookrepository.findAll();
	}
	public Book updateBook(Book book) {
		
		return bookrepository.saveAndFlush(book);
	}
	/*public String updateById(int id, Book book) {
		
		bookrepository.saveAndFlush(book);
	  	if(bookrepository.existsById(id))
			{		
	  			return "updated";
			}
			else
			{
		          return "enter valid id";
			}

	}*/
	public String deleteBook(Book book) {
		
		bookrepository.delete(book);
		return "Deleted successfully!";
	}
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		bookrepository.deleteById(id);
	}
}
