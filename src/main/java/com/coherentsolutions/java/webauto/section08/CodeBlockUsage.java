package com.coherentsolutions.java.webauto.section08.advanced;

/**
 * Demonstrates the best practice of always using code blocks with if statements,
 * even if the block contains only a single statement.
 */
public class CodeBlockUsage {
    public static void main(String[] args) {
        int temperature = 25;

        if (temperature > 20) System.out.println("It's warm outside.");
         else {
            System.out.println("It's cool outside.");
        }

        // Even for a single line, using braces prevents future errors if more lines are added.
    }
}
