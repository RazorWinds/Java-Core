package com.spartaglobal.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming {

    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>(List.of(5, 20, 9, 6, 2, 1));
//
//        numbers.removeIf(i -> i > 10); 
//        numbers.removeIf(i -> i%3 == 0);
//        numbers.removeIf(i -> i >= 5);
//        numbers.removeIf(i -> i%2 == 1);
//        
//        System.out.println(numbers.toString());

        List<Integer> numbers = new ArrayList<>(List.of(5, 20, 9, 6, 2, 1));
        List<Integer> numbersPlusOne = numbers.stream().map(n -> n + 1).toList();
        numbers.forEach(System.out::println);

        Calculator myCalc = new Calculator(4, 6);
        System.out.println(myCalc.getCustomResult((n1, n2) -> (n1 + n2) * 10));
        System.out.println(myCalc.doMath(i -> i * Math.PI));

        System.out.println(myCalc.compare((n1, n2) -> n1 > n2));

        List<String> names = Arrays.asList(
                "John", "Paul", "George", "Ringo", "Jonathan",
                "George", "Paul", "Richard", "Freddie", "Brian",
                "Rodger", "John", "Brian", "James");
        
        names.stream().distinct().filter(str -> str.matches("\\b(?=\\w*([aeiouAEIOU])\\w*([aeiouAEIOU])\\w*)[^\\W\\d_]*\\b")).forEach(System.out::println);
    }
}
