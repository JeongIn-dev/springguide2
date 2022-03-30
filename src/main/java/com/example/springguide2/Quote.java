package com.example.springguide2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public Quote() {
        System.out.println("create");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("set type");
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        System.out.println("set value");
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}