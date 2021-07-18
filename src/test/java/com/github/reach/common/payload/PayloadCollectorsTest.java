package com.github.reach.common.payload;

import com.github.reach.common.exceptions.ConverterIsNull;
import org.junit.Test;

import java.util.*;

import static com.github.reach.common.payload.PayloadCollectors.*;
import static com.github.reach.common.payload.PayloadCollectorsMocks.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;

public class PayloadCollectorsTest {

    @Test
    public void shouldConvertPersonDto_ToArrayListPerson_success_size_many() {
        List<Person> act = people_dtos_size_many.stream()
                .collect(toArrayList(Person.map()));
        assertEquals(
                "Should check of collection type",
                ArrayList.class, act.getClass()
        );
        assertThat(
                "Should compare two collections (size is many)",
                act,
                containsInAnyOrder(people_database_version_zero_size_many.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToArrayListPerson_success_size_two() {
        List<Person> act = people_dtos_size_two.stream()
                .collect(toArrayList(Person.map()));
        assertEquals(
                "Should check of collection type",
                ArrayList.class, act.getClass()
        );
        assertThat(
                "Should compare two collections (size is two)",
                act,
                containsInAnyOrder(people_database_version_zero_size_two.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToArrayListPerson_success_size_one() {
        List<Person> act = people_dtos_size_one.stream()
                .collect(toArrayList(Person.map()));
        assertEquals(
                "Should check of collection type",
                ArrayList.class, act.getClass()
        );
        assertThat(
                "Should compare two collections (size is one)",
                act,
                containsInAnyOrder(people_database_version_zero_size_one.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToArrayListPerson_success_size_zero() {
        List<Person> act = people_dtos_size_zero.stream()
                .collect(toArrayList(Person.map()));
        assertEquals(
                "Should check of collection type",
                ArrayList.class, act.getClass()
        );
        assertThat(
                "Should compare two collections (size is zero)",
                act,
                containsInAnyOrder(people_database_version_zero_size_zero.toArray())
        );
    }

    @Test(expected = ConverterIsNull.class)
    public void shouldConvertPersonDto_ToArrayListPerson_fail_convertorIsNull() {
        people_dtos_size_many.stream().collect(toArrayList(null));
    }

    @Test
    public void shouldConvertPersonDto_ToLinkedListPerson_success_many() {
        List<Person> act = people_dtos_size_many.stream()
                .collect(toLinkedList(Person.map()));
        assertEquals(
                "Should check of collection type",
                LinkedList.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is many)",
                act,
                containsInAnyOrder(people_database_version_zero_size_many.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToLinkedListPerson_success_size_two() {
        List<Person> act = people_dtos_size_two.stream()
                .collect(toLinkedList(Person.map()));
        assertEquals(
                "Should check of collection type",
                LinkedList.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is two)",
                act,
                containsInAnyOrder(people_database_version_zero_size_two.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToLinkedListPerson_success_size_one() {
        List<Person> act = people_dtos_size_one.stream()
                .collect(toLinkedList(Person.map()));
        assertEquals(
                "Should check of collection type",
                LinkedList.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is one)",
                act,
                containsInAnyOrder(people_database_version_zero_size_one.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToLinkedListPerson_success_size_zero() {
        List<Person> act = people_dtos_size_zero.stream()
                .collect(toLinkedList(Person.map()));
        assertEquals(
                "Should check of collection type",
                LinkedList.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is zero)",
                act,
                containsInAnyOrder(people_database_version_zero_size_zero.toArray())
        );
    }

    @Test(expected = ConverterIsNull.class)
    public void shouldConvertPersonDto_ToLinkedListPerson_fail_convertorIsNull() {
        people_dtos_size_many.stream().collect(toLinkedList(null));
    }

    @Test
    public void shouldConvertPersonDto_ToHashSetPerson_success_many() {
        Set<Person> act = people_dtos_size_many.stream()
                .collect(toHashSet(Person.map()));
        assertEquals(
                "Should check of collection type",
                HashSet.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is many)",
                act,
                containsInAnyOrder(people_database_version_zero_size_many.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToHashSetPerson_success_two() {
        Set<Person> act = people_dtos_size_two.stream()
                .collect(toHashSet(Person.map()));
        assertEquals(
                "Should check of collection type",
                HashSet.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is two)",
                act,
                containsInAnyOrder(people_database_version_zero_size_two.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToHashSetPerson_success_size_one() {
        Set<Person> act = people_dtos_size_one.stream()
                .collect(toHashSet(Person.map()));
        assertEquals(
                "Should check of collection type",
                HashSet.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is one)",
                act,
                containsInAnyOrder(people_database_version_zero_size_one.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToHashSetPerson_success_size_zero() {
        Set<Person> act = people_dtos_size_one.stream()
                .collect(toHashSet(Person.map()));
        assertEquals(
                "Should check of collection type",
                HashSet.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is zero)",
                act,
                containsInAnyOrder(people_database_version_zero_size_one.toArray())
        );
    }

    @Test(expected = ConverterIsNull.class)
    public void shouldConvertPersonDto_ToHashSetPerson_fail_convertorIsNull() {
        people_dtos_size_many.stream().collect(toHashSet(null));
    }

    @Test
    public void shouldConvertPersonDto_ToLinkedHashSet_Person_success_many() {
        Set<Person> act = people_dtos_size_many.stream()
                .collect(toLinkedHashSet(Person.map()));
        assertEquals(
                "Should check of collection type",
                LinkedHashSet.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is many)",
                act,
                containsInAnyOrder(people_database_version_zero_size_many.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToLinkedHashSet_Person_success_size_two() {
        Set<Person> act = people_dtos_size_two.stream()
                .collect(toLinkedHashSet(Person.map()));
        assertEquals(
                "Should check of collection type",
                LinkedHashSet.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is two)",
                act,
                containsInAnyOrder(people_database_version_zero_size_two.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToLinkedHashSet_Person_success_size_one() {
        Set<Person> act = people_dtos_size_one.stream()
                .collect(toLinkedHashSet(Person.map()));
        assertEquals(
                "Should check of collection type",
                LinkedHashSet.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is one)",
                act,
                containsInAnyOrder(people_database_version_zero_size_one.toArray())
        );
    }

    @Test
    public void shouldConvertPersonDto_ToLinkedHashSet_Person_success_size_zero() {
        Set<Person> act = people_dtos_size_zero.stream()
                .collect(toLinkedHashSet(Person.map()));
        assertEquals(
                "Should check of collection type",
                LinkedHashSet.class, act.getClass()
        );
        assertThat("Should compare equals two collections (size is zero)",
                act,
                containsInAnyOrder(people_database_version_zero_size_zero.toArray())
        );
    }

    @Test(expected = ConverterIsNull.class)
    public void shouldConvertPersonDto_ToLinkedHashSet_Person_success_convertorIsNull() {
        people_dtos_size_many.stream().collect(toLinkedHashSet(null));
    }

}