package com.siham;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPersonWithIterator {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "siham"));
        people.add(new Person(2, "meryem"));
        people.add(new Person(3, "fatima-ezzahera"));

        // Suppression avec iterator (sécurisé)
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().equals("meryem")) {
                iterator.remove(); // Suppression sécurisée
            }
        }

        System.out.println("Set après suppression de 'meryem' : " + people);
    }
}