package com.spartaglobal.abstracttask;

import java.util.Objects;

public class Square extends Shape{
    private double side;
    
    public Square(double sideLength) {
        this.side = sideLength;
    }
    
    public double calculateArea(){
        return Math.pow(this.side, 2);
    }

    @Override
    public void print() {
        System.out.println("I am sqaure :)");
    }
    
    public double getSide() {
        return side;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj){return true;}
        
        return (obj instanceof Square aSquare)
                && aSquare.getSide() == this.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.side);
    }
    
}
