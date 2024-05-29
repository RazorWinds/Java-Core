package com.spartaglobal.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Calculator {

    private final Integer num1;
    private final Integer num2;

    public Calculator(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer getCustomResult(BiFunction<Integer, Integer, Integer> calculation) {
        return calculation.apply(num1, num2);
    }
    
    public Double doMath(Function<Integer, Double> func){
        return func.apply(num1);
    }
    
    public boolean compare(BiPredicate<Integer, Integer> func){
        return func.test(num1, num2);
    }
}
