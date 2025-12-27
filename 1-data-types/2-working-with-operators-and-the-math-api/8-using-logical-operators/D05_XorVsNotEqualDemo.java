package com.pluralsight.datatypes.m2.clip08;

public class D05_XorVsNotEqualDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // XOR returns true *only when exactly one operand is true
        boolean xorResult1 = a ^ b;  // true ^ false -> true
        boolean xorResult2 = a ^ c;  // true ^ true  -> false

        // != returns true whenever the two operands are different
        boolean notEqualResult1 = (a != b);  // true != false -> true
        boolean notEqualResult2 = (a != c);  // true != true  -> false

        System.out.println("a ^ b: " + xorResult1);
        System.out.println("a ^ c: " + xorResult2);
        System.out.println("a != b: " + notEqualResult1);
        System.out.println("a != c: " + notEqualResult2);
    }
}
