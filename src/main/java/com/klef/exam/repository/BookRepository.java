package com.klef.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.models.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
