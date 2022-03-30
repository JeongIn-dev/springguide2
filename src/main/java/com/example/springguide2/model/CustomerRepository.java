package com.example.springguide2.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByFirstName(@Param("firstName") String firstName);
    List<Customer> findByLastName(String lastNAme);
}
