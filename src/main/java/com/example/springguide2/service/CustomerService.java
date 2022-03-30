package com.example.springguide2.service;

import com.example.springguide2.model.Customer;
import com.example.springguide2.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }

    public String createCustomer(Customer customer) {
        Customer saved = customerRepository.save(customer);
        return saved.getId();
    }
}
