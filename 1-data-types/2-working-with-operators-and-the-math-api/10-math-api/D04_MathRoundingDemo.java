package com.pluralsight.datatypes.m2.clip10;

public class D04_MathRoundingDemo {
    public static void main(String[] args) {
        // Using Math.round() - Rounds to the nearest integer
        long roundedLong = Math.round(5.7);  
        System.out.println("Math.round(5.7) = " + roundedLong + " (Rounds to nearest long)");

        int roundedInt = Math.round(5.4f);  
        System.out.println("Math.round(5.4f) = " + roundedInt + " (Rounds to nearest int)");

        // Using Math.rint() - Rounds to the nearest even integer in case of a tie
        double rintValue = Math.rint(5.5);
        System.out.println("Math.rint(5.5) = " + rintValue + " (Rounds to nearest even integer in case of tie)");

        double rintValue2 = Math.rint(6.5);
        System.out.println("Math.rint(6.5) = " + rintValue2 + " (6.5 rounds to even, which is 6.0)");

        // Using Math.floor() - Rounds down to the nearest integer
        double floorValue = Math.floor(5.7);
        System.out.println("Math.floor(5.7) = " + floorValue + " (Always rounds down to the nearest integer)");

        // Using Math.ceil() - Rounds up to the nearest integer
        double ceilingValue = Math.ceil(5.2);
        System.out.println("Math.ceil(5.2) = " + ceilingValue + " (Always rounds up to the nearest integer)");
    }
}
