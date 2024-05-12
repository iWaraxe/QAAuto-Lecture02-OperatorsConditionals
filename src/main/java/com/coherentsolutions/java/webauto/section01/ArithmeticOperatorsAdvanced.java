package com.coherentsolutions.java.webauto.section01;

/**
 * Demonstrates advanced concepts of arithmetic operators including overflow,
 * underflow and type promotions in expressions.
 */
public class ArithmeticOperatorsAdvanced {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Demonstrating overflow
        System.out.println("MaxInt + 1 = " + (maxInt + 1));  // Overflow: Wraps around to negative

        // Demonstrating underflow
        System.out.println("MinInt - 1 = " + (minInt - 1));  // Underflow: Wraps around to positive

        // Type promotions in expressions
        byte byteVal1 = 100;
        byte byteVal2 = 20;
        int result = byteVal1 + byteVal2;  // byte values promoted to int in expressions
        System.out.println("Result of byte addition (promoted to int): " + result);

        // Using expressions in a more complex context
        double sqrtValue = Math.sqrt(byteVal1 + byteVal2);
        System.out.println("Square root of the sum: " + sqrtValue);
    }
}
