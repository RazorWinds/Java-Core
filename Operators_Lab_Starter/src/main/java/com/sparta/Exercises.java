package com.sparta;

public class Exercises {

    // what does this method do?  Add unit tests for this behaviour
    public static boolean myMethod(int num1, int num2)
    {
        if (num1 == num2) return false;
        return (num1 % num2) == 0;
    }

    // implement this method so that it returns true if num is even, otherwise false
    public static boolean evenOdd(int num) {
        return (num%2 == 0);
    }
	
    // correct this method - it should multiply x by y and return the result plus one
    public static int anotherMethod(int x, int y) {
        x *= y;
        return ++x;
    }
	
	    // correct this method so that it passes its tests
    public static String stringMethod(String theString) {
        if (theString != null && theString.toUpperCase().startsWith("H")) {
            return "Starts with H";
        }
        return "Doesn't start with H";
    }
	
	// implement this method so that it returns
    // the sum of all numbers between 1 and n inclusive
    // that are divisible by either 2 or 5
    public static int sumEvenFive(int max) {
        return -1;
    }
	

	


}
