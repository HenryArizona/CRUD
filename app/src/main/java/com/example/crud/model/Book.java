package com.example.crud.model;

public class Book {
    private long bookId;
    private String bookName;
    private String bookAuthor;

    public Book() {

    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String toString() {
        return bookName + " by " + bookAuthor;
    }
}
