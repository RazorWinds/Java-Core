package com.spartaglobal.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Generics {

    public static void main(String[] args) {
        IntegerRectangle iRect = new IntegerRectangle(2, 4);

        DoubleRectangle dRect = new DoubleRectangle(2.0, 4.0);

        System.out.printf("Integer Rectangle Area: %d\n", iRect.getWidth() * iRect.getHeight());

        System.out.printf("Double Rectangle Area: %f\n", dRect.getWidth() * dRect.getHeight());

        //Object
        ObjectRectangle oIRect = new ObjectRectangle(2, 4);
        ObjectRectangle oDRect = new ObjectRectangle(2.0, 4.0);

        System.out.printf("ObjectInteger Rectangle Area: %d\n",
                (Integer) oIRect.getWidth() * (Integer) oIRect.getHeight());

        System.out.printf("ObjectDouble Rectangle Area: %f\n",
                (Double) oDRect.getWidth() * (Double) oDRect.getHeight());

        // Generic
        GenericRectangle<Integer> gIRect = new GenericRectangle<>(2, 4);
        GenericRectangle<Double> gDRect = new GenericRectangle<>(2.0, 4.0);

        System.out.printf("GenericInteger Rectangle Area: %d\n",
                gIRect.getWidth() * gIRect.getHeight());
        System.out.printf("GenericDouble Rectangle Area: %f\n",
                gDRect.getWidth() * gDRect.getHeight());
        
        outputToConsole(gDRect.getWidth() * gDRect.getHeight());
  

    }

    static <V> void outputToConsole(V value) {

        System.out.println("Rectangle has an area of " + value);

    }
}
