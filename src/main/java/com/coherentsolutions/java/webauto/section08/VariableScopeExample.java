package com.coherentsolutions.java.webauto.section08;

/**
 * Demonstrates the importance of proper variable scope.
 * This class explains a common mistake where variables are inappropriately scoped,
 * leading to limited use and potential errors.
 */
public class VariableScopeExample {
    public static void main(String[] args) {
        int number = 10; // Correctly scoped outside the if block

        if (number > 5) {
            int result = number * 2; // Scope limited to the if block
            System.out.println("Result inside if: " + result);
        }
        // System.out.println("Access result: " + result); // This would cause an error
    }
}
