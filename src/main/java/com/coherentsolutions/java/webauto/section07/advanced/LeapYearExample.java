package com.coherentsolutions.java.webauto.section07.advanced;

/**
 * Demonstrates advanced conditional logic to determine if a given year is a leap year.
 * A year is a leap year if it is divisible by 4 but not by 100, unless it is divisible by 400.
 */
public class LeapYearExample {
    public static void main(String[] args) {
        int year = 2024; // Example year, you can input any year here

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
