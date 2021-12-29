package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

//get all books
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }
// insert book
    public String addBook(Book book) {
        this.bookRepository.save(book);
        return "Book is added successfully";
    }
//delete book
    public String deleteBook(Long bookId) {
        if(this.bookRepository.existsById(bookId)) {
            this.bookRepository.deleteById(bookId);
            return "Book is removed successfully";
        }
        return "Book is not found and not deleted";
    }
    //update book
    public String updateBook(Book book) {
        if(this.bookRepository.existsById(book.getBookId())) {
          this.bookRepository.save(book);
          return "Book is updated successfully";
        }
        return "Book is not found and not updated";
    }
}
