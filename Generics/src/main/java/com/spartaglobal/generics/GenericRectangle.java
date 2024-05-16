package com.spartaglobal.generics;


public class GenericRectangle<R> {
    private R width;
    private R height;
 
    public GenericRectangle(R width, R height) {
        this.width = width;
        this.height = height;
    }
 
    public R getWidth() {
        return width;
    }
 
    public void setWidth(R width) {
        this.width = width;
    }
 
    public R getHeight() {
        return height;
    }
 
    public void setHeight(R height) {
        this.height = height;
    }
}