package com.example.bookstore.controller;

import com.example.bookstore.model.Book;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(path = "/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping(path = "/addbook")
    public String addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping(path = "books/{bookId}")
    public String deleteBook(@PathVariable Long bookId) {
        return bookService.deleteBook(bookId);
    }
}
