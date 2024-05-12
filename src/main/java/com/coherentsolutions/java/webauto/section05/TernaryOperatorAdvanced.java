package com.coherentsolutions.java.webauto.section05;

/**
 * Demonstrates advanced concepts of the ternary operator, including nested ternary operations
 * and practical examples of its use in decision-making processes within code.
 */
public class TernaryOperatorAdvanced {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 15;
        int result;

        // Nested ternary operator example
        result = (a > b) ? ((a > c) ? a : c) : (b > c ? b : c);
        System.out.println("The largest number is: " + result);  // Finds the largest of three numbers

        // Practical use in a real-world scenario: calculating discounts
        double price = 250.0;
        double discount = (price > 200.0) ? 0.10 : 0.05;
        double finalPrice = price * (1 - discount);
        System.out.println("Original price: $" + price);
        System.out.println("Discount applied: " + (int)(discount * 100) + "%");
        System.out.println("Final price: $" + finalPrice);

        // Using ternary operator for setting string values based on conditions
        String status = (finalPrice > 200) ? "Expensive" : "Affordable";
        System.out.println("Purchase status: " + status);
    }
}
