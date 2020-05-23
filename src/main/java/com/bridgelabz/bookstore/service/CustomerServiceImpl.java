package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.CustomerDto;
import com.bridgelabz.bookstore.exception.CustomerException;
import com.bridgelabz.bookstore.model.Customer;
import com.bridgelabz.bookstore.repository.ICustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Customer addCustomer(CustomerDto customerDto) {
        Customer customer = modelMapper.map(customerDto, Customer.class);
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(int customerId, int orderQuantity) throws CustomerException {
        Customer customer = customerRepository.findById(customerId).get();
        if (customerRepository.findById(customerId).isPresent()) {
            customer.setOrderQuantity(orderQuantity);
            return customerRepository.save(customer);
        }
        else throw new CustomerException(CustomerException.ExceptionType.INVALID_CUSTOMER_NAME, "INVALID_CUSTOMER_NAME");
    }

    @Override
    public void removeCustomer(int customerId) throws CustomerException {
        if (customerRepository.findById(customerId).isPresent())
            customerRepository.deleteById(customerId);
        else throw new CustomerException(CustomerException.ExceptionType.CUSTOMER_NOT_FOUND, "CUSTOMER_NOT_FOUND");
    }

    @Override
    public List<Customer> getCustomerList() {
        return customerRepository.findAll();
    }
}
