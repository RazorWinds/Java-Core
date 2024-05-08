package com.spartaglobal.classdiagrams;


public class Customer extends Person{
    private String deliveryAddress = "An address goes here";
    
    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }
   @Override
    public String getDetails() {
        return "Deliver Address: " + deliveryAddress + super.getDetails();
    }
}
