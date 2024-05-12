package com.coherentsolutions.java.webauto.section07.advanced;

/**
 * Demonstrates advanced concepts in decision making using nested if statements and logical operators.
 * This class showcases how complex logical conditions can be evaluated within nested if structures.
 */
public class AdvancedConditionalLogicExample {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You cannot drive without a license.");
            }
        } else {
            System.out.println("You are too young to drive.");
        }
    }
}
