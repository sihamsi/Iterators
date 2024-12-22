package com.siham;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class TestWithIteratorTest {

    @Test
    public void testRemoveWithIterator() {
        Set<Person> individuals = new HashSet<>();
        individuals.add(new Person(1, "siham"));
        individuals.add(new Person(2, "meryem"));
        individuals.add(new Person(3, "fati"));

        // Remove "Jane" using iterator
        Iterator<Person> personIterator = individuals.iterator();
        while (personIterator.hasNext()) {
            Person individual = personIterator.next();
            if (individual.getName().equals("meryem")) {
                personIterator.remove();
            }
        }

        // Validate removal
        assertFalse(individuals.stream().anyMatch(ind -> ind.getName().equals("Jane")),
                "Jane should be removed from the set");
        assertEquals(2, individuals.size(), "Set size should be 2 after removal");
    }
}
