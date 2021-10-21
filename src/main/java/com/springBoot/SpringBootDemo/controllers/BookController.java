package com.springBoot.SpringBootDemo.controllers;

import com.springBoot.SpringBootDemo.entities.Book;
import com.springBoot.SpringBootDemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
public class BookController {

    @Autowired
    public BookService bookService;

   /* @RequestMapping("/books")
    @ResponseBody
    public String getAllBooks() {
        return "These are all books";
    }*/

   /*@RequestMapping("/books")
   public String getAllBooks() {
       //this will return books.jsp present in sec/main/webapp/views directory , refer application.properties for view resolver config
       return "books";
   }*/

   /*@RequestMapping("/books")
   public Book getAllBooks() {
       System.out.println("Coming here");
       Book book = new Book(1, "SathwikYazwa");
       return book;
   }*/ //this will not work in @Controller class  , we can return book object only in @RestController and because of jackson dependency so refer below fnc

    /*@GetMapping("/books")
    public Book getAllBooks() {
        Book book = new Book(1, "SathwikYazwa");
        return book;
    }*/

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }


}
