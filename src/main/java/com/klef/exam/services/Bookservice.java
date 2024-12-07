package com.klef.exam.services;

import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.models.Book;
@Service
public interface Bookservice {
	public String updateBook(Book book);
}
