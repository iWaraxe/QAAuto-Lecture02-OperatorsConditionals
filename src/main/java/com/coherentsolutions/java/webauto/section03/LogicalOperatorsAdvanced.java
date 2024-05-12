package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates more advanced use of logical operators, including short-circuit behavior and complex boolean expressions.
 */
public class LogicalOperatorsAdvanced {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Short-circuit behavior
        System.out.println("Short-circuit AND (a && b && c): " + (a && (b && c)));  // Evaluates to false
        System.out.println("Short-circuit OR (a || b || c): " + (a || (b || c)));  // Evaluates to true

        // Using logical operators in complex boolean expressions
        boolean result = (a || b) && (c || b);
        System.out.println("Complex expression ((a || b) && (c || b)): " + result);  // Evaluates to true

        // Demonstrating the use of logical operators in conditional statements
        if (a && c) {
            System.out.println("Both a and c are true");
        } else {
            System.out.println("Either a or c is false");
        }

        // Explanation of short-circuiting
        // Logical AND (&&) short-circuits, meaning it stops evaluating if it finds any false
        // Logical OR (||) short-circuits, meaning it stops evaluating if it finds any true

        // Note:
        // This behavior is useful to prevent unnecessary computations or to avoid errors such as
        // accessing invalid indexes or null objects in more complex conditions.
    }
}
