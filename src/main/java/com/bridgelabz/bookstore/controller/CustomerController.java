package com.bridgelabz.bookstore.controller;

import com.bridgelabz.bookstore.dto.CustomerDto;
import com.bridgelabz.bookstore.exception.CustomerException;
import com.bridgelabz.bookstore.model.Customer;
import com.bridgelabz.bookstore.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customerController")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.addCustomer(customerDto);
    }

    @PutMapping("/updateCustomerDetails/{customerId}")
    public Customer updateCustomerDetails(@PathVariable int customerId, int orderQuantity) throws CustomerException {
        return customerService.updateCustomer(customerId, orderQuantity);
    }

    @DeleteMapping("/removeCustomer/{customerId}")
    public void removeCustomer(@PathVariable int customerId) throws CustomerException {
        customerService.removeCustomer(customerId);
    }

    @GetMapping("/getCustomerList")
    public List<Customer> getCustomerList() {
        return customerService.getCustomerList();
    }
}
