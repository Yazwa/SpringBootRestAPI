package com.springBoot.SpringBootDemo.services;

import com.springBoot.SpringBootDemo.entities.Book;
import com.springBoot.SpringBootDemo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>)bookRepository.findAll();
        return list;
    }

    public Book addBook(Book book) {
        Book addedBook = bookRepository.save(book);
        return addedBook;
    }
}
