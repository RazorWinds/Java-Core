package com.spartaglobal.java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
========= NOT DONE ============
Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at l
 */
public class Java_Basics {
    private static final char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
    
    
    public static List<Character> getVowelList(){
        List<Character> newList = new ArrayList<Character>();
        for (char vowel : vowels) {
            newList.add(vowel);
        }
        
       return newList;
    }
    
    //Given an array of integers, convert them to a single int made up of the digits
    public static int arrayToNumber(int[] array) {
        StringBuilder builder = new StringBuilder();

        for (int number : array) {
            builder.append(number);
        }

        return Integer.parseInt(builder.toString());
    }

    //Take a string and return it with all the vowels removed in uppercase
    public static String removeVowels(String inputString) {
        
        List<Character> newList = getVowelList();
        StringBuilder builder = new StringBuilder();

       

        for (char letter : inputString.toCharArray()) {
            if (!newList.contains(letter)) {
                builder.append(letter);
            }
        }
        return builder.toString().toUpperCase();
    }

    // For an array of ints, return the second higest number
    public static int highestInArray(int[] array) {
        int highest = array[0];
        for (int number : array) {
            highest = Math.max(highest, number);
        }
        return highest;
    }

    //For a String, create an array of all the duplicate letters
    public static char[] getDupclicates(String inputString) {
        
        List<Character> dupeLetters = new ArrayList<Character>();
        List<Character> foundLetters = new ArrayList<Character>();

        for (char letter : inputString.toUpperCase().toCharArray()) {
            if (foundLetters.contains(letter)) {
                if (!dupeLetters.contains(letter)){
                    dupeLetters.add(letter);
                }
            } else {
                foundLetters.add(letter);
            }
        }
        char[] arr = new char[dupeLetters.size()];
        for (int i=0; i < dupeLetters.size(); i++){
            arr[i] = dupeLetters.get(i);
        }
        return arr;
    }
    
    //Create a 2 value array which counts all the consonants and vowels in a string
    public static int[] countLetterUnits(String inputString){
        int[] counter = {0,0};
        
        List<Character> vowelList = getVowelList();
        
        for (char letter : inputString.toUpperCase().toCharArray()){
            if (vowelList.contains(letter)){
                ++counter[0];
            }else{
                ++counter[1];
            }
        }
        return counter;
    }
    
    //Write a method that takes a string and a letter and checks if the letter is in that string
    public static boolean isInString(String inputString, char letter){
        String toStr = Character.toString(letter).toUpperCase();
        return inputString.toUpperCase().contains(toStr);
    }
    
    
    //Give a sequence of numbers return the sum of all the numbers divisible by 2 and/or 3
    public static int weirdSum(int sequence){
        int finalSum = 0;
        
        String sequenceStr = Integer.toString(sequence);
        
        for (char digitChar : sequenceStr.toCharArray()){
            int digit = Integer.parseInt(Character.toString(digitChar));
            if (digit % 3 == 0 || digit % 2 == 0){
                finalSum += digit;
            }
        }
        
        return finalSum;
    }
    
    
    //Write a method that takes a string and returns it with all the consonants in uppercase
    public static String consonantUpper(String inputString){
        StringBuilder builder = new StringBuilder();
        List<Character> vowelList = getVowelList();
        
        for (char letter : inputString.toCharArray()){
            if (vowelList.contains(letter)) {
                builder.append(letter);
            }else {
                builder.append(Character.toString(letter).toUpperCase());
            }
        }
        return builder.toString();
    }
}
