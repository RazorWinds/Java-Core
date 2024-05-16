package com.spartaglobal.collections;

public class Person implements Comparable<Person> {

    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{"
                + "firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + '}';
    }

    @Override
    public int compareTo(Person o) {
        int lastNameComparison = this.getLastName().compareTo(o.getLastName());

        if (lastNameComparison == 0) {
            return this.getFirstName().compareTo(o.getFirstName());

        } else {

            return lastNameComparison;

        }
    }
}
