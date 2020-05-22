package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.CustomerDto;
import com.bridgelabz.bookstore.exception.CustomerException;
import com.bridgelabz.bookstore.model.Customer;

import java.util.List;

public interface ICustomerService {
    Customer addCustomer(CustomerDto customerDto);

    Customer updateCustomer(int customerId, int orderQuantity) throws CustomerException;

    void removeCustomer(int customerId) throws CustomerException;

    List<Customer> getCustomerList();
}
