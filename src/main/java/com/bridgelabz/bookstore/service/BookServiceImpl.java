package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.model.Book;
import com.bridgelabz.bookstore.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService{

    @Autowired
    IBookRepository bookRepository;

    @Override
    public List<Book> getBookList() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }
}