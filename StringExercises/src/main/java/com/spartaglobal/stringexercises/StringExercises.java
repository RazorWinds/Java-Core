package com.spartaglobal.stringexercises;

public class StringExercises {

    public static int countWords(String[] array, char letter) {
        int counter = 0;
        for (String word : array) {
            if (word.toUpperCase().charAt(0) == Character.toUpperCase(letter)) {
                counter++;
            }
        }
        return counter;
    }

    public static int countWordsInString(String str, char letter) {
        return countWords(str.split(" "), letter);
    }

    public static String transformString(String inputStr, int inputInt) {
        if (inputStr == null) {
            inputStr = "";
        }

        StringBuilder builder = new StringBuilder();
        builder.append(inputStr.toUpperCase());
        for (int i = 0; i < inputInt; i++) {
            builder.append(i);
        }
        return builder.toString();
    }

    public static boolean isPalindrome(String inputStr) {
        if (inputStr == null || inputStr.length() == 0) {
            return false;
        }
        String removedWhiteSpace = inputStr.replaceAll("\\s+","");
        StringBuilder builder = new StringBuilder(removedWhiteSpace);
        
        
        if (builder.reverse().toString().equalsIgnoreCase(removedWhiteSpace)) {
            return true;
        }
        return false;
    }
    
    
    
    public static String address(int doorNum, String streetName, String area, String postcode){
        return String.format(
                "%d "+
                "%s, "+
                "%s "+
                "%s.",
                doorNum, streetName, area, postcode);
    }
    
    public static String scorer(int scoreTotal, int scoreMax){
        double percent = (double)scoreTotal/(double)scoreMax * 100;
        
        return String.format(
                "You got " +
                "%d " +
                "out of " +
                "%d: " +
                "%1.1f%%",
                scoreTotal, scoreMax, percent);
    }

}
