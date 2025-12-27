package com.pluralsight.datatypes.m2.clip07;

public class D05_FloatingPointComparisonDemo {
    public static void main(String[] args) {
        double a = 0.1 + 0.2; // Floating-point addition
        double b = 0.3;

        // Using '==' to compare floating-point numbers
        boolean result = (a == b); // false due to floating-point precision issues

        // Printing results with explanation
        System.out.println("double a = 0.1 + 0.2;");
        System.out.println("double b = 0.3;");
        System.out.println("(a == b): " + result);
        System.out.println("Actual value of a: " + a);
        System.out.println("Actual value of b: " + b);
    }
}
