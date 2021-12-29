package com.example.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Long bookId;
    private String author;
    private String bookName;

    public Book() {
    }

    public Book(Long bookId, String author, String bookName) {
        this.bookId = bookId;
        this.author = author;
        this.bookName = bookName;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
