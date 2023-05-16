package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Book;
import com.geekster.MappingPractice.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping()
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
    @GetMapping()
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
    @GetMapping("/{id}")
    public Book getBook(@PathVariable String id){
        return bookService.getBook(id);
    }
    @PutMapping("/{id}")
    public String updateBook(@PathVariable String id,@RequestBody Book book){
        return bookService.updateBook(id,book);
    }
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable String id){
        return bookService.deleteBook(id);
    }
}
