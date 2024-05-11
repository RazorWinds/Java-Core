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
        StringBuilder builder = new StringBuilder(inputStr);

        if (builder.reverse().toString().equalsIgnoreCase(inputStr)) {
            return true;
        }
        return false;
    }

}
