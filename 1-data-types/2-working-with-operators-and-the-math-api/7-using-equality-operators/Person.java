package com.pluralsight.datatypes.m2.clip07;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // Constructor, getters, and setters

    @Override // 1.
    public boolean equals(Object obj) {
        // 2. Check if obj is the same as this object
        if (this == obj) return true;

        // 3. Check if obj is null or not an instance of Person
        // (also casting obj to Person)
        return obj instanceof Person person && 
               // 4. Compare significant fields
               age == person.age && 
               Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
