package com.spartaglobal.abstracttask;


public abstract class Shape implements Printable, Comparable<Shape>{
    public abstract double calculateArea();
    @Override
    public String toString(){
        return String.valueOf(calculateArea());
    }
    
    @Override
    public int compareTo(Shape comparingShape) {
        if (comparingShape.calculateArea() > this.calculateArea()){
            return 1;
        }else if (comparingShape.calculateArea() < this.calculateArea()){
            return -1;
        }else {
            return 0;
        }
            
    }
}
