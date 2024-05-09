package com.spartaglobal.staticdemo;

public class Customer {

    private String name;

    public Customer(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;
    }
    
    @Override
    public String toString() {
        return "YOU THOUGHT YOU COULD PRINT THIS OBJECT!";
    }
}
