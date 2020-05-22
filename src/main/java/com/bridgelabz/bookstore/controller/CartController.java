package com.bridgelabz.bookstore.controller;

import com.bridgelabz.bookstore.dto.CartDto;
import com.bridgelabz.bookstore.exception.CartException;
import com.bridgelabz.bookstore.model.Cart;
import com.bridgelabz.bookstore.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cart")
@RestController
public class CartController {

    @Autowired
    private ICartService cartService;

    @PostMapping("/addToCart")
    public Cart addBookToCart(@RequestBody CartDto cartDto) {
        return cartService.addBookToCart(cartDto);
    }

    @PutMapping("/updateBooksInCart/{bookId}")
    public Cart updateCart(@PathVariable int bookId, int quantity) throws CartException {
        return cartService.updateCart(bookId, quantity);
    }

    @DeleteMapping("/deleteBookFromCart/{bookId}")
    public void removeBookFromCart(@PathVariable int bookId) throws CartException{
        cartService.removeBookFromCart(bookId);
    }

    @GetMapping("/getBooksInCart")
    public List<Cart> getListOfBooksInCart(){
        return cartService.getListOfBooksInCart();
    }
}











