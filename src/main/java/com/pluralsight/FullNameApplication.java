package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.println("First name: "); // Asking user for first name
        String firstName = myScanner.nextLine(); // Storing first name

        System.out.println("Middle name: "); // Asking user for middle name
        String middleName = myScanner.nextLine(); // Storing middle name

        System.out.println("Last name: "); // Asking user for last name
        String lastName = myScanner.nextLine(); // Storing last name

        System.out.println("Suffix: "); // Asking user for suffix
        String suffix = myScanner.next(); // Storing suffix

        System.out.println(firstName + " " + middleName + " " + lastName + ", " + suffix);





    }
}
