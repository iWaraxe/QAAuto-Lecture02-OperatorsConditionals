package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the basic use of comparison operators in Java.
 */
public class ComparisonOperatorsBasic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Display the results of various comparison operations
        System.out.println("a == b = " + (a == b));  // Check if a is equal to b
        System.out.println("a != b = " + (a != b));  // Check if a is not equal to b
        System.out.println("a > b = " + (a > b));    // Check if a is greater than b
        System.out.println("a < b = " + (a < b));    // Check if a is less than b
        System.out.println("b >= a = " + (b >= a));  // Check if b is greater than or equal to a
        System.out.println("b <= a = " + (b <= a));  // Check if b is less than or equal to a
    }
}
