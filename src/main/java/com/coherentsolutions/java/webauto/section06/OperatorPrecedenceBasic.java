package com.coherentsolutions.java.webauto.section06;

/**
 * Demonstrates the basic principles of operator precedence in Java.
 * This class illustrates how different operators affect the evaluation order
 * of expressions without explicit parentheses.
 */
public class OperatorPrecedenceBasic {
    public static void main(String[] args) {
        int x = 7 + 3 * 2;  // Multiplication (*) has higher precedence than addition (+)
        System.out.println("x = 7 + 3 * 2 evaluates to " + x);  // x will be 13, not 20

        int y = 7 * 3 + 2;  // Multiplication (*) is evaluated before addition (+)
        System.out.println("y = 7 * 3 + 2 evaluates to " + y);  // y will be 23

        int z = 7 * (3 + 2);  // Parentheses () take the highest precedence
        System.out.println("z = 7 * (3 + 2) evaluates to " + z);  // z will be 35
    }
}
