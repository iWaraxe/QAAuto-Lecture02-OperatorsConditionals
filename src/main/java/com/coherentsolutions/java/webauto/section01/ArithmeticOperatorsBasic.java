package com.coherentsolutions.java.webauto.section01;

/**
 * Demonstrates the basic use of arithmetic operators in Java.
 */
public class ArithmeticOperatorsBasic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        // Display the results of various arithmetic operations
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));

        // Demonstrate post-increment and post-decrement
        System.out.println("a++ = " + (a++));  // Print then increment
        System.out.println("b-- = " + (b--));  // Print then decrement

        // Demonstrate pre-increment
        System.out.println("d++ = " + (d++));  // Print then increment
        System.out.println("++d = " + (++d));  // Increment then print
    }
}
