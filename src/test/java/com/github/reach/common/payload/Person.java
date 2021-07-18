package com.github.reach.common.payload;

import java.util.Objects;
import java.util.function.Function;

public class Person {

    private long id;

    private String firstName;

    private int version;

    public Person(long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Person(long id, String firstName, int version) {
        this.id = id;
        this.firstName = firstName;
        this.version = version;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getVersion() {
        return version;
    }

    public static Function<PersonDto, Person> map() {
        return p -> new Person(p.getId(), p.getFirstName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && version == person.version && Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, version);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", version=" + version +
                '}';
    }
}
