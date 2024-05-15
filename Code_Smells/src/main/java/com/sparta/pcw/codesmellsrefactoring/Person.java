package com.sparta.pcw.codesmellsrefactoring;

// Class to represent a Person
public class Person {

    private final String firstName;
    private final String lastName;
    private int age;
    private Address address;

    public Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public Person(String fName, String lName, int houseNum, String street, String town) {
        this(fName, lName);
        this.address = new Address(houseNum, street, town);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String move() {
        return "Walking along";
    }

    @Override
    public String toString() {
        String addressString = address.getFullAddress();

        return String.format("%s Name: %s Age: %s. %s",
                super.toString(),
                getFullName(),
                age,
                addressString);
    }
}
