package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.println("First name: "); // Asking user for first name
        String firstName = myScanner.nextLine().trim(); // Storing first name

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1); // Capitalizes the first letter of first name

        System.out.println("Middle name: "); // Asking user for middle name
        String middleName = myScanner.nextLine().trim(); // Storing middle name

        middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1); // Capitalizes the first letter of middle name

        System.out.println("Last name: "); // Asking user for last name
        String lastName = myScanner.nextLine().trim(); // Storing last name

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1); // Capitalizes the first letter of last name

        System.out.println("Suffix: "); // Asking user for suffix
        String suffix = myScanner.nextLine().trim(); // Storing suffix

        suffix = suffix.substring(0, 1).toUpperCase() + suffix.substring(1); // Capitalizes the first letter of suffix

        String fullName = (firstName + " " + middleName + " " + lastName + ", " + suffix); // Making a variable for the full name

        if (middleName.isEmpty() && suffix.isEmpty()) {
            fullName = (firstName + " " + lastName); // Removing middle and suffix if left blank
        }
        if (middleName.isEmpty()) {
            fullName = (firstName + " " + lastName + ", " + suffix); // Removing middle name if left blank
        }
        if (suffix.isEmpty()) {
            fullName = (firstName + " " + middleName + " " + lastName); // Removing suffix if left blank
        }

        System.out.println(" ");

        System.out.println("Full name: " + fullName);







    }

}
