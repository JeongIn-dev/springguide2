package com.example.springguide2.rest;

import com.example.springguide2.model.Customer;
import com.example.springguide2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public Customer getCustomerByFirstName(@RequestParam String firstName) {
        return customerService.getCustomerByFirstName(firstName);
    }

    @PostMapping("/customer")
    public String createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }
}
