// FactorialCalculator.java
package com.example.recursion;

/**
 * A utility class for calculating factorials.
 * 
 * The factorial of a non-negative integer n is the product of all
 * positive integers less than or equal to n.
 * 
 * For example:
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 */
public class FactorialCalculator {
    
    /**
     * Main method to demonstrate the factorial calculation.
     */
    public static void main(String[] args) {
        int result = calculateFactorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }

    /**
     * Calculates the factorial of a number recursively.
     * 
     * @param num The number to calculate factorial for
     * @return The factorial value
     * @throws IllegalArgumentException if num is negative
     */
    public static int calculateFactorial(int num) {
        // Input validation: reject negative numbers
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        
        // Base cases
        if (num == 0 || num == 1) {
            return 1;
        }
        
        // Recursive case
        return num * calculateFactorial(num - 1);
    }
}