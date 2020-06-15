package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.CustomerDto;
import com.bridgelabz.bookstore.exception.CustomerException;
import com.bridgelabz.bookstore.model.Customer;

public interface ICustomerService {
    Customer addCustomer(CustomerDto customerDto);

    Customer updateCustomer(long customerId, CustomerDto orderQuantity);

    void removeCustomer(long customerId) throws CustomerException;

    Customer getCustomer(long customerId);
}
