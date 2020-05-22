package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.CartDto;
import com.bridgelabz.bookstore.model.Cart;
import com.bridgelabz.bookstore.repository.ICartRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    ICartRepository cartRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Cart addBookToCart(CartDto cartDto) {
        Cart cart = modelMapper.map(cartDto, Cart.class);
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getListOfBooksInCart() {
        return cartRepository.findAll();
    }

    @Override
    public Cart updateCart(Long bookId, int bookQuantity) {
        Cart cart = cartRepository.findById(bookId).get();
        cart.setQuantity(bookQuantity);
        return cartRepository.save(cart);
    }

    @Override
    public void removeBookFromCart(Long bookId) {
        cartRepository.deleteById(bookId);

    }
}
