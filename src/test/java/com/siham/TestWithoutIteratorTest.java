package com.siham;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class TestWithoutIteratorTest {

    @Test
    public void testRemoveWithoutIterator() {
        Set<Person> individuals = new HashSet<>();
        individuals.add(new Person(1, "siham"));
        individuals.add(new Person(2, "mereyem"));
        individuals.add(new Person(3, "fati"));

        // Tentative de suppression sans itérateur, ce qui provoque une
        // ConcurrentModificationException
        assertThrows(UnsupportedOperationException.class, () -> {
            for (Person individual : individuals) {
                if (individual.getName().equals("meryem")) {
                    individuals.remove(individual); // Problème ici
                }
            }
        });
    }
}