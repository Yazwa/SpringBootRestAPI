package com.springBoot.SpringBootDemo.repositories;

import com.springBoot.SpringBootDemo.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepository extends CrudRepository<Book, Integer> {
}
