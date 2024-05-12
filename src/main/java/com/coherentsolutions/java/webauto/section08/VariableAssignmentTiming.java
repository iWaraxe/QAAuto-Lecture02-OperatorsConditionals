package com.coherentsolutions.java.webauto.section08;

/**
 * Explains when to declare versus when to assign a variable, and the implications of each approach.
 */
public class VariableAssignmentTiming {
    public static void main(String[] args) {
        int declaredLater; // Declaration without immediate assignment

        if (args.length > 0) {
            declaredLater = Integer.parseInt(args[0]); // Assigned based on condition
            System.out.println("Assigned in condition: " + declaredLater);
        } else {
            declaredLater = 0; // Default assignment
            System.out.println("Assigned by default: " + declaredLater);
        }
    }
}
