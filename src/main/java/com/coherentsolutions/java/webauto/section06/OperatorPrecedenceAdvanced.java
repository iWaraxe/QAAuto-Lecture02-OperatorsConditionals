package com.coherentsolutions.java.webauto.section06;

/**
 * Explores more advanced aspects of operator precedence in Java, including logical operators
 * and their interaction with arithmetic operators. This class also demonstrates how parentheses
 * can be used to change the default order of operations to achieve the desired results.
 */
public class OperatorPrecedenceAdvanced {
    public static void main(String[] args) {
        boolean a = true, b = false;
        int x = 5, y = 10;

        // Example of mixing logical and arithmetic operators
        boolean result = a && y > x;  // Logical AND (&&) has lower precedence than comparison (>)
        System.out.println("Result of a && y > x is " + result);  // Evaluates to true && true

        // Using parentheses to change precedence
        boolean complexResult = (a && b) || (x + 5 > y);  // Using parentheses to explicitly define precedence
        System.out.println("Complex result of (a && b) || (x + 5 > y) is " + complexResult);  // Evaluates to false || true

        // Mixed operators with assignment
        int k = 10, j = 5;
        int complexOperation = k + j * 3;  // Multiplication (*) evaluated before addition (+)
        System.out.println("k + j * 3 evaluates to " + complexOperation);  // Evaluates to 25

        int adjustedOperation = (k + j) * 3;  // Parentheses change the evaluation order
        System.out.println("(k + j) * 3 evaluates to " + adjustedOperation);  // Evaluates to 45
    }
}
