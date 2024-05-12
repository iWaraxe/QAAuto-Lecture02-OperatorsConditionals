package com.coherentsolutions.java.webauto.section05;

/**
 * Demonstrates the basic use of the ternary operator in Java.
 * This class shows how the ternary operator can be used to simplify conditional assignments.
 */
public class TernaryOperatorBasic {
    public static void main(String[] args) {
        int a, b;
        a = 10;

        // Use of the ternary operator for conditional assignment
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b (a == 1): " + b);  // Outputs: Value of b (a == 1): 30

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b (a == 10): " + b);  // Outputs: Value of b (a == 10): 20
    }
}
