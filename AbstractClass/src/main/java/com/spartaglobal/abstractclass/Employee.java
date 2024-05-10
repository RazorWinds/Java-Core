package com.spartaglobal.abstractclass;


public class Employee extends Person {
    
    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }
    
    
    @Override
    public void delete(){
        System.out.println("Left company");
    }
}
