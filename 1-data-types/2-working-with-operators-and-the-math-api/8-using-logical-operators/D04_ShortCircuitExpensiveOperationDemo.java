package com.pluralsight.datatypes.m2.clip08;

public class D04_ShortCircuitExpensiveOperationDemo {
    public static void main(String[] args) {
        boolean a = false;
        
        System.out.println("Using logical AND (&):");
        boolean result1 = a & expensiveOperation();
        System.out.println("result1: " + result1);
        
        System.out.println("\nUsing short-circuit AND (&&):");
        boolean result2 = a && expensiveOperation();
        System.out.println("result2: " + result2);
    }
    
    public static boolean expensiveOperation() {
        System.out.println("Expensive operation executed!");
        return false;
    }
}