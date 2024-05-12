package com.coherentsolutions.java.webauto.section08.advanced;

/**
 * Demonstrates correct initialization of min and max variables to handle all possible input values,
 * addressing a common mistake where max and min are wrongly set to zero.
 */
public class MinMaxValuesExample {
    public static void main(String[] args) {
        int[] numbers = { -10, -20, -30, -40 };
        int max = Integer.MIN_VALUE; // Start min enough to handle negative numbers
        int min = Integer.MAX_VALUE; // Start max enough

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
