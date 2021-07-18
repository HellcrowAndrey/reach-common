package com.github.reach.common.payload;

import java.util.List;

public class PayloadCollectorsMocks {

    public static final List<PersonDto> people_dtos_size_many = List.of(
            new PersonDto(1L, "first-test-1"),
            new PersonDto(2L, "first-test-2"),
            new PersonDto(3L, "first-test-3"),
            new PersonDto(4L, "first-test-4"),
            new PersonDto(5L, "first-test-5")
    );

    public static final List<PersonDto> people_dtos_size_two = List.of(
            new PersonDto(1L, "first-test-1"),
            new PersonDto(2L, "first-test-2")
    );

    public static final List<PersonDto> people_dtos_size_one = List.of(
            new PersonDto(1L, "first-test-1")
    );

    public static final List<PersonDto> people_dtos_size_zero = List.of();

    public static final List<Person> people_database_version_zero_size_many = List.of(
            new Person(1L, "first-test-1", 0),
            new Person(2L, "first-test-2", 0),
            new Person(3L, "first-test-3", 0),
            new Person(4L, "first-test-4", 0),
            new Person(5L, "first-test-5", 0)
    );

    public static final List<Person> people_database_version_zero_size_two = List.of(
            new Person(1L, "first-test-1", 0),
            new Person(2L, "first-test-2", 0)
    );

    public static final List<Person> people_database_version_zero_size_one = List.of(
            new Person(1L, "first-test-1", 0)
    );

    public static final List<Person> people_database_version_zero_size_zero = List.of();

}
