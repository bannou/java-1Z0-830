package com.pluralsight.datatypes.m2.clip08;

public class D03_OperatorPrecedenceDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        System.out.println("Initial values:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        
        // First evaluate a && b and c || d, then XOR the results
        boolean result = a && b ^ c || d;
        
        System.out.println("\nExpression: a && b ^ c || d");
        System.out.println("Step 1: a && b = " + (a && b));
        System.out.println("Step 2: c || d = " + (c || d));
        System.out.println("Final result = " + result);
    }
}
