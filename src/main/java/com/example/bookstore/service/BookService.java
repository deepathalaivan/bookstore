package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    List<Book> bookList = new ArrayList<>(Arrays.asList(
            new Book(1l,"Author1", "Book1"),
            new Book(2l,"Author2", "Book2"),
            new Book(3l,"Author3", "Book3")));
//get all books
    public List<Book> getAllBooks() {
        return bookList;
    }
// insert book
    public String addBook(Book book) {
        bookList.add(book);
        return "Book is added successfully";
    }
//delete book
    public String deleteBook(Long bookId) {
        bookList.removeIf(book -> book.getBookId().equals(bookId));
        return "Book is removed successfully";
    }
}
