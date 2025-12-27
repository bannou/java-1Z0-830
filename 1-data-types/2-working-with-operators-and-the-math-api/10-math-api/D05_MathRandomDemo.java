package com.pluralsight.datatypes.m2.clip10;

public class D05_MathRandomDemo {
    public static void main(String[] args) {
        // Generating a random integer between 1 and 10
        int randomInt = (int) (Math.random() * 10) + 1;
        System.out.println("Random integer between 1 and 10: " + randomInt);

        // Defining min and max for a flexible range
        int min = 15;
        int max = 25;

        // Generating a random integer between min and max (inclusive)
        int randomNum = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Random integer between " + min + " and " + max + ": " + randomNum);
    }
}
