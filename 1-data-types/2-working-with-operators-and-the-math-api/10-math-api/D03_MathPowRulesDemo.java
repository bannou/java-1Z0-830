package com.pluralsight.datatypes.m2.clip10;

public class D03_MathPowRulesDemo {
    public static void main(String[] args) {
        // Rule 1: Any number raised to 0 returns 1.0
        System.out.println("Rule 1: x^0 = 1.0");
        System.out.println("2^0 = " + Math.pow(2, 0));
        System.out.println("-2^0 = " + Math.pow(-2, 0));
        System.out.println("0^0 = " + Math.pow(0, 0));
        
        // Rule 2: Any number raised to 1 returns itself
        System.out.println("\nRule 2: x^1 = x");
        System.out.println("2^1 = " + Math.pow(2, 1));
        System.out.println("-2^1 = " + Math.pow(-2, 1));
        
        // Rule 3: NaN rules
        System.out.println("\nRule 3: NaN behavior");
        System.out.println("NaN^2 = " + Math.pow(Double.NaN, 2));
        System.out.println("2^NaN = " + Math.pow(2, Double.NaN));
        
        // Rule 4: Negative base with integer exponents
        System.out.println("\nRule 4: Negative base with integer exponents");
        System.out.println("-2^2 = " + Math.pow(-2, 2));   // Even exponent: positive result
        System.out.println("-2^3 = " + Math.pow(-2, 3));   // Odd exponent: negative result
        
        // Rule 5: Negative base with non-integer exponents
        System.out.println("\nRule 5: Negative base with non-integer exponents");
        System.out.println("-2^2.5 = " + Math.pow(-2, 2.5));   // Results in NaN
        System.out.println("-2^0.5 = " + Math.pow(-2, 0.5));   // Results in NaN
    }
}
