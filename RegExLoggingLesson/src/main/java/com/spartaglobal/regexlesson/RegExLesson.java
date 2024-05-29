package com.spartaglobal.regexlesson;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegExLesson {

    public static final Logger LOGGER = Logger.getLogger(RegExLesson.class.getName());

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

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINE);
        
        LOGGER.addHandler(consoleHandler);
        
        LOGGER.log(Level.SEVERE, "SEVERE is a message level indicating a potential problem"); // highest
        
        LOGGER.log(Level.WARNING, "WARNING is a message level indicating a potential problem");

        LOGGER.log(Level.INFO, "INFO is a message level for informational messages");

        LOGGER.log(Level.CONFIG, "CONFIG is a message level for static configuration messages");

        LOGGER.log(Level.FINE, "FINE is a message level providing tracing information");

        LOGGER.log(Level.FINER, "FINER indicates a fairly detailed tracing message");

        LOGGER.log(Level.FINEST, "FINEST indicates a highly detailed tracing message");   // lowest
    }
}
