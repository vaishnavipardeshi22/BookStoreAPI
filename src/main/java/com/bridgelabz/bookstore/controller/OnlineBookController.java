package com.bridgelabz.bookstore.controller;

import com.bridgelabz.bookstore.exception.BookStoreException;
import com.bridgelabz.bookstore.model.Book;
import com.bridgelabz.bookstore.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookStoreController")
public class OnlineBookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/showBooks")
    public List<Book> getBooks() {
        return bookService.getBookList();
    }

    @GetMapping("/searchByBookName/{title}")
    public List<Book> searchByBookName(@PathVariable String title) throws BookStoreException {
        return bookService.searchByTitle(title);
    }

    @GetMapping("/searchByAuthorName/{author}")
    public List<Book> searchByAuthorName(@PathVariable String author) throws BookStoreException {
        return bookService.searchByAuthor(author);
    }
}
