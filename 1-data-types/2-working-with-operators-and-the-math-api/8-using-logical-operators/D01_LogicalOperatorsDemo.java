package com.pluralsight.datatypes.m2.clip08;

public class D01_LogicalOperatorsDemo {
    public static void main(String[] args) {
        // Initialize our boolean variables
        boolean a = true;
        boolean b = false;
        
        System.out.println("Initial values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("----------------------------------------");
        
        // Bitwise AND
        boolean result1 = a & b;
        System.out.println("Logical AND (&):");
        System.out.println("a & b = " + result1);
        System.out.println("----------------------------------------");
        
        // Bitwise OR
        boolean result2 = a | b;
        System.out.println("Logical OR (|):");
        System.out.println("a | b = " + result2);
        System.out.println("----------------------------------------");
        
        // Bitwise XOR
        boolean result3 = a ^ b;
        System.out.println("Logical XOR (^):");
        System.out.println("a ^ b = " + result3);
        System.out.println("----------------------------------------");
        
        // Logical AND
        boolean result4 = a && b;
        System.out.println("Short-Circuit logical AND (&&):");
        System.out.println("a && b = " + result4);
        System.out.println("----------------------------------------");
        
        // Logical OR
        boolean result5 = a || b;
        System.out.println("Short-Circuit logical OR (||):");
        System.out.println("a || b = " + result5);
        System.out.println("----------------------------------------");
        
        // Logical NOT
        boolean result6 = !a;
        System.out.println("Logical NOT (!):");
        System.out.println("!a = " + result6);
    }
}
