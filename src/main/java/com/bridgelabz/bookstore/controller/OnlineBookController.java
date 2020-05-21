package com.bridgelabz.bookstore.controller;

import com.bridgelabz.bookstore.model.Book;
import com.bridgelabz.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookStoreController")
public class OnlineBookController {

    @Autowired
    BookService bookService;

    @GetMapping("/showBooks")
    public List<Book> getBooks() {
        return bookService.getBookList();
    }
}
