package com.coherentsolutions.java.webauto.section04;

/**
 * Demonstrates advanced concepts of assignment operators including bit manipulation.
 * This class explores the use of bitwise assignment operators that are often used
 * in low-level programming, graphics, and performance-critical applications.
 */
public class AssignmentOperatorsAdvanced {
    public static void main(String[] args) {
        int x = 256; // Example value
        int y = 7;   // Example value for manipulation

        // Bitwise AND assignment
        x &= y;
        System.out.println("x &= y = " + x);  // Output may vary depending on initial x and y

        // Bitwise OR assignment
        x |= y;
        System.out.println("x |= y = " + x);  // Restores some bits depending on y

        // Bitwise XOR assignment
        x ^= y;
        System.out.println("x ^= y = " + x);  // Toggles bits depending on y

        // Left shift assignment
        x <<= 2;
        System.out.println("x <<= 2 = " + x); // Multiplies x by 4

        // Right shift assignment
        x >>= 1;
        System.out.println("x >>= 1 = " + x); // Divides x by 2

        // Unsigned right shift assignment
        x >>>= 1;
        System.out.println("x >>>= 1 = " + x); // Divides x by 2 without sign extension
    }
}
