package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates more advanced concepts of comparison operators, including comparisons
 * between different types, and understanding type promotion in comparisons.
 */
public class ComparisonOperatorsAdvanced {
    public static void main(String[] args) {
        double x = 20.0;
        int y = 20;

        // Comparing different data types
        System.out.println("x == y = " + (x == y));  // Compares double with int

        // Type promotion in action
        byte a = 10;
        short b = 10;
        System.out.println("a == b = " + (a == b));  // byte and short are promoted to int before comparison

        // Comparison involving floating-point numbers
        float f1 = 15.0f;
        float f2 = 15.0f;
        System.out.println("f1 == f2 = " + (f1 == f2));  // Check for equality

        // Use of epsilon to compare floating-point numbers for equality
        double epsilon = 0.0001;  // Precision level
        double d1 = 15.0001;
        double d2 = 15.0002;
        System.out.println("d1 approximately equals d2 = " + (Math.abs(d1 - d2) < epsilon));

        // Logical combination of comparison operators
        int age = 25;
        boolean isAdult = age >= 18 && age <= 65;  // Check if age is between 18 and 65
        System.out.println("Is adult: " + isAdult);
    }
}
