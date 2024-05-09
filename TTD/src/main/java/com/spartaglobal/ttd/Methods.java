package com.spartaglobal.ttd;


public class Methods {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    
    
        // implement this method so that it returns true if x is greater than or equal to y
    public static boolean greaterEqual(int x, int y){
        return x >= y;
    }

    // implement this method so that it take an int as an input,// squares it, adds 101, divides the result by 7, then subtracts 4.// return a double.
    public static double BODMAS(int inputNumber){
        inputNumber *= inputNumber;
        inputNumber += 101;
        double finalNum = inputNumber;
        finalNum /= 7;
        return finalNum - 4;
    }


    // implement this method so that it returns true if input is "password"// regardless of case
    public static boolean checkInput(String input){
        if (input.equalsIgnoreCase("password")){
            return true;
        }
        return false;
    }

    // implement this method so that it returns the sum of all the numbers from start to end
    public static int sumNums(int start, int end){
        int finalNumber = 0;
        for (int i = start; i <= end; i++) {
            finalNumber += i;
        }
        return finalNumber;
    }

    // implement this method so that it returns the sum// of all the numbers in the array nums
    public static int sumArray(int[] nums){
        int finalNumber = 0;
        for (int arrayItem : nums) {
            finalNumber += arrayItem;
        }
        return finalNumber;
    }
}

