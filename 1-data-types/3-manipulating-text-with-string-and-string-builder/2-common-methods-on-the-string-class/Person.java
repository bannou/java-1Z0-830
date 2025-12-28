package com.pluralsight.datatypes.m3.clip02;

public class Person {
    private String name;
    private int age;

    public static void main(String[] args) {
        Person alice = new Person("Alice", 25);
        System.out.println(alice);
    }

    // @Override
    // public String toString() {
    //     return "Person[name=" + name + ", age=" + age + "]";
    // }

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Greeting method
    public String introduce() {
        return "Hi, my name is " + name + " and I am " + age + " years old.";
    }
}
