package com.pluralsight.datatypes.m2.clip07;

record PersonRecord(String name, int age) {}

public class D04_RecordDemo {
    public static void main(String[] args) {
        // Creating two record instances with the same values
        PersonRecord p1 = new PersonRecord("Alice", 30);
        PersonRecord p2 = new PersonRecord("Alice", 30);
        PersonRecord p3 = new PersonRecord("Bob", 25);

        // Checking equals()
        System.out.println("Automatic equals() in Records:");
        System.out.println("p1.equals(p2): " + p1.equals(p2) + " (Records automatically compare field values)");
        System.out.println("p1.equals(p3): " + p1.equals(p3) + " (False because field values differ)");
        System.out.println("----------------------------------------");

        // Checking hashCode()
        System.out.println("Automatic hashCode() in Records:");
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("p3.hashCode(): " + p3.hashCode());
    }
}
