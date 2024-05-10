package com.spartaglobal.abstracttask;


public abstract class Shape{
    public abstract double calculateArea();
    @Override
    public String toString(){
        return String.valueOf(calculateArea());
    }
}
