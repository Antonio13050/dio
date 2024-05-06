package org.example.anatomiaclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    protected static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        String firstName = "Antonio";
        String lastName = "Carlos";

        String fullName = fullName(firstName, lastName);

        logger.info(fullName);
    }

    private static String fullName(String firstName, String lastName) {
        return "Result: " + firstName.concat(" ").concat(lastName);
    }
}