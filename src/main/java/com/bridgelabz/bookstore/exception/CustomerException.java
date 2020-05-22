package com.bridgelabz.bookstore.exception;

public class CustomerException extends Exception{

    public ExceptionType type;

    public enum ExceptionType{
        CUSTOMER_NOT_FOUND, INVALID_CUSTOMER_NAME;
    }

    public CustomerException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
