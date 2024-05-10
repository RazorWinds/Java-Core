package com.spartaglobal.abstracttask;

class Circle extends Shape implements Printable{
    private double radius;
    
    Circle(double radius2) {
        radius = radius2;
    }
    
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    
     @Override
    public void print() {
        System.out.println("I am circle :o");
    }
}
