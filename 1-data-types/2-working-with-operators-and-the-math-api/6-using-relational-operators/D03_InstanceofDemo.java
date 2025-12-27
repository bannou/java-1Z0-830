package com.pluralsight.datatypes.m2.clip06;

interface ElectricVehicle {} // Interface

class Vehicle {} // Base class

// Subclasses
class Car extends Vehicle implements ElectricVehicle {}
class Bike extends Vehicle {}

public class D03_InstanceofDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle nullVehicle = null;

        System.out.println("=== Basic instanceof Checks ===");
        System.out.println("myCar instanceof Car: " + (myCar instanceof Car));  // true
        System.out.println("myCar instanceof Vehicle: " + (myCar instanceof Vehicle));  // true
        System.out.println("myBike instanceof Bike: " + (myBike instanceof Bike));  // true
        System.out.println("myBike instanceof Vehicle: " + (myBike instanceof Vehicle));  // true

        System.out.println("\n=== Interface instanceof Check ===");
        System.out.println("myCar instanceof ElectricVehicle: " + (myCar instanceof ElectricVehicle)); // true
        System.out.println("myBike instanceof ElectricVehicle: " + (myBike instanceof ElectricVehicle)); // false

        System.out.println("\n=== Checking Against Object ===");
        System.out.println("myCar instanceof Object: " + (myCar instanceof Object));  // true

        System.out.println("\n=== instanceof with null ===");
        System.out.println("nullVehicle instanceof Vehicle: " + (nullVehicle instanceof Vehicle));  // false

        System.out.println("\n=== Safe Downcasting with Pattern Matching ===");

        if (myCar instanceof Car car) { // Pattern Matching
            System.out.println("myCar instanceof Car car: true (myCar is automatically cast to Car and assigned to the variable car)");
            System.out.println("Now car holds the casted Car instance: " + car.getClass().getSimpleName());
        }

        System.out.println();

        if (myBike instanceof Car car) {
            System.out.println("This won't print because myBike is not a Car: " + car.getClass().getSimpleName());
        } else {
            System.out.println("myBike instanceof Car car: false (myBike is NOT an instance of Car, so no automatic casting occurs)");
        }
    }
}
