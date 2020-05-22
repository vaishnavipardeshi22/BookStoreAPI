package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.CartDto;
import com.bridgelabz.bookstore.exception.CartException;
import com.bridgelabz.bookstore.model.Cart;
import com.bridgelabz.bookstore.repository.ICartRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    private ICartRepository cartRepository;

    @Autowired
    private ModelMapper modelMapper;

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
    public Cart updateCart(int bookId, int bookQuantity) throws CartException {
        Cart cart = cartRepository.findById(bookId).get();
        if (cartRepository.findById(bookId).isPresent()) {
            cart.setQuantity(bookQuantity);
            return cartRepository.save(cart);
        } else throw new CartException(CartException.ExceptionType.BOOK_IS_NOT_AVAILABLE, "BOOK_IS_NOT_AVAILABLE");
    }

    @Override
    public void removeBookFromCart(int bookId) throws CartException {
        if (cartRepository.findById(bookId).isPresent())
            cartRepository.deleteById(bookId);
        throw new CartException(CartException.ExceptionType.INVALID_BOOK_ID, "INVALID_BOOK_ID");
    }
}
