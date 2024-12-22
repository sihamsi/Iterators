package com.siham;

import java.util.HashSet;
import java.util.Set;

public class TestPersonWithoutIterator {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "siham"));
        people.add(new Person(2, "meryem"));
        people.add(new Person(3, "fatima-ezzahera"));

        // Suppression sans iterator (provoque une ConcurrentModificationException)
        for (Person person : people) {
            if (person.getName().equals("meryem")) {
                people.remove(person); // Erreur ici
            }
        }
    }
}
