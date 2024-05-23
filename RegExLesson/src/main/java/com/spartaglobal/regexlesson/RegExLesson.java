package com.spartaglobal.regexlesson;

public class RegExLesson {

    public static void main(String[] args) {
        String input = "Cathy,Phil, Nish,   Manish,Alex Blunt";
        String[] splitStringEither = input.split("[, ]");

        int count = 1;
        for (String s : splitStringEither) {
            System.out.printf("%d:\t%s%n", count++, s);
        }

        String postcode = "HA01NP";
        String postcodeRegex = "^[A-Z]{1,2}[0-9]{1,2}[A-Z]?(\\s*[0-9][A-Z]{1,2})?$";
        if (postcode.matches(postcodeRegex)) {
            System.out.println("Postcode is valid");
        } else {
            System.out.println("Postcode is invalid");
        }
    }
}
