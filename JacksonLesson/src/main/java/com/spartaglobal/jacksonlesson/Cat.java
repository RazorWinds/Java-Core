package com.spartaglobal.jacksonlesson;

import java.time.LocalDate;

public class Cat {

    private String name;
    private LocalDate dob;
    private int priority;

    public Cat(String name, LocalDate dob, int priority) {
        this.name = name;
        this.dob = dob;
        this.priority = priority;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", priority=" + priority +
                '}';
    }
}