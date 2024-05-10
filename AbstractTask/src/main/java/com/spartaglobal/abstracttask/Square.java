package com.spartaglobal.abstracttask;

class Square extends Shape implements Printable{
    private double side;
    
    Square(double sideLength) {
        this.side = sideLength;
    }
    
    public double calculateArea(){
        return Math.pow(this.side, 2);
    }

    @Override
    public void print() {
        System.out.println("I am sqaure :)");
    }
    
    
}
