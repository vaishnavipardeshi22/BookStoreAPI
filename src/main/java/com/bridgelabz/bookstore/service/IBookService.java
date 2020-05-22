package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.exception.BookStoreException;
import com.bridgelabz.bookstore.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getBookList();

    List<Book> searchByTitle(String title) throws BookStoreException;

    List<Book> searchByAuthor(String author) throws BookStoreException;

}
