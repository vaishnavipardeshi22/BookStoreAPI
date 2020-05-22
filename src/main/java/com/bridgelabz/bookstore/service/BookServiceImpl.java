package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.exception.BookStoreException;
import com.bridgelabz.bookstore.model.Book;
import com.bridgelabz.bookstore.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<Book> getBookList() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> searchByTitle(String title) throws BookStoreException {
        List<Book> bookListByTitle = bookRepository.findByTitle(title);
        if (bookListByTitle.isEmpty())
            throw new BookStoreException(BookStoreException.ExceptionType.BOOK_IS_NOT_AVAILABLE, "BOOK_IS_NOT_AVAILABLE");
        return bookListByTitle;
    }

    @Override
    public List<Book> searchByAuthor(String author) throws BookStoreException {
        List<Book> bookListOfAuthor = bookRepository.findByAuthor(author);
        if (bookListOfAuthor.isEmpty())
            throw new BookStoreException(BookStoreException.ExceptionType.BOOK_IS_NOT_AVAILABLE, "BOOK_IS_NOT_AVAILABLE");
        return bookRepository.findByAuthor(author);
    }
}