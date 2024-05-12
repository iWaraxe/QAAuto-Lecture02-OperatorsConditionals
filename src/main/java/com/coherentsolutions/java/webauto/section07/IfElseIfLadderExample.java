package com.coherentsolutions.java.webauto.section07;

/**
 * Demonstrates the usage of 'if-else-if' ladder in Java.
 * This class handles multiple conditions sequentially using an if-else-if ladder,
 * which is useful for more complex decision-making processes.
 */
public class IfElseIfLadderExample {
    public static void main(String[] args) {
        int x = 30;

        if (x == 10) {
            System.out.print("X value is 10");
        } else if (x == 20) {
            System.out.print("X value is 20");
        } else if (x == 30) {
            System.out.print("X value is 30");
        } else {
            System.out.print("This is the else statement");
        }
    }
}
