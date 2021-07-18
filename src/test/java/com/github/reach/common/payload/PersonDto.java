package com.github.reach.common.payload;

import java.util.function.Function;

public class PersonDto {

    private long id;

    private String firstName;

    public PersonDto() {
    }

    public PersonDto(long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public static Function<Person, PersonDto> map() {
        return p -> new PersonDto(p.getId(), p.getFirstName());
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
