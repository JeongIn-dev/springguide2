package com.example.springguide2.model;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    public String id;

    public String firstName;

    public String lastName;
    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
