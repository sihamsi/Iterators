package com.siham;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPersonWithIterator {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "Siham"));
        people.add(new Person(2, "Meryem"));
        people.add(new Person(3, "Fatima-Ezzahera"));

        // Remove "Meryem" using an iterator (safe removal)
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().equalsIgnoreCase("Meryem")) {
                iterator.remove(); // Safe removal
            }
        }

        // Print the set after removal
        System.out.println("Set après suppression de 'Meryem' : " + people);
    }
}
