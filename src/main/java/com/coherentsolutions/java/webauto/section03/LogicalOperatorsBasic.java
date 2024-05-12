package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates the basic use of logical operators in Java.
 */
public class LogicalOperatorsBasic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Display the results of various logical operations
        System.out.println("a && b = " + (a && b));  // Logical AND
        System.out.println("a || b = " + (a || b));  // Logical OR
        System.out.println("!(a && b) = " + !(a && b));  // Logical NOT

        // This outputs:
        // a && b = false
        // a || b = true
        // !(a && b) = true
    }
}
