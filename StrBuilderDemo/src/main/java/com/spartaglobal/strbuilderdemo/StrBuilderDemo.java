package com.spartaglobal.strbuilderdemo;

public class StrBuilderDemo {
    public static void main(String[] args) {
        String[] names = {"Duncan", "Laclan", "Anna", "Conner", "Tom", "Owen"};
        StringBuilder result = new StringBuilder();

        for (String name : names) {
            result.append(name);
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("<--------");
        System.out.println(result.toString());
    }
}
