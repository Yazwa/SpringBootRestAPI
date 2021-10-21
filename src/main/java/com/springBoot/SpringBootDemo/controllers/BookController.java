package com.springBoot.SpringBootDemo.controllers;

import com.springBoot.SpringBootDemo.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class BookController {

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

    @GetMapping("/books")
    public Book getAllBooks() {
        Book book = new Book(1, "SathwikYazwa");
        return book;
    }
}
