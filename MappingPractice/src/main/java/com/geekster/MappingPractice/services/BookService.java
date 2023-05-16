package com.geekster.MappingPractice.services;

import com.geekster.MappingPractice.models.Book;
import com.geekster.MappingPractice.repositories.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;
    public String addBook(Book book) {
        bookRepo.save(book);
        return "Book added";
    }

    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    public Book getBook(String id) {
        return bookRepo.findById(id).get();
    }

    public String updateBook(String id, Book book) {
        bookRepo.save(book);
        return "Book Updated";
    }

    public String deleteBook(String id) {
        bookRepo.deleteById(id);
        return "book deleted";
    }
}
