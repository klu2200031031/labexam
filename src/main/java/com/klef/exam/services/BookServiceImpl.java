package com.klef.exam.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.exam.repository.BookRepository;
import com.klef.jfsd.exam.models.Book;

@Service
public class BookServiceImpl implements Bookservice{
	
	@Autowired
	private BookRepository bookRepository;
	@Override
	public String updateBook(Book book) {
		Optional<Book> object = bookRepository.findById(book.getBookid());
		if(object.isPresent()) {
			Book b= new Book();
			b.setTitle(book.getTitle());
			b.setAuthor(book.getAuthor());
			b.setGenre(book.getGenre());
			b.setPrice(book.getPrice());
			b.setYear(book.getYear());
			
			bookRepository.save(b);
			return "user data updated";
		}else {
			return "user id not found";
		}
	}
	

}
