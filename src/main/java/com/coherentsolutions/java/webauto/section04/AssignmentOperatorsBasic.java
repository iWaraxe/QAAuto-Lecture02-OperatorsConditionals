package com.coherentsolutions.java.webauto.section04;

/**
 * Demonstrates the basic use of assignment operators in Java.
 * This class provides examples of simple assignment and combined assignment operations
 * such as addition, subtraction, multiplication, division, and modulo with assignment.
 */
public class AssignmentOperatorsBasic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        // Simple assignment
        c = a + b;
        System.out.println("c = a + b = " + c);  // Output: c = a + b = 30

        // Addition assignment
        c += a;
        System.out.println("c += a = " + c);     // Output: c += a = 40

        // Subtraction assignment
        c -= a;
        System.out.println("c -= a = " + c);     // Output: c -= a = 30

        // Multiplication assignment
        c *= a;
        System.out.println("c *= a = " + c);     // Output: c *= a = 300

        // Division assignment
        c /= b;
        System.out.println("c /= b = " + c);     // Output: c /= a = 15

        // Modulo assignment
        c %= a;
        System.out.println("c %= a = " + c);     // Output: c %= a = 5
    }
}
