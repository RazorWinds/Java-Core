package com.spartaglobal.exceptionhandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Animal {
    private String name;
    private int age;
    private Date vaccinationDate;

    public Animal() {}

    public Animal(String name, int age, String dateString) throws ParseException {
        setName(name);
        setAge(age);
        setVaccinationDate(dateString);
    }

    public int getAge() {
        return age;
    }

    public Date getVaccinationDate(){
        return vaccinationDate;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            throw new IllegalArgumentException("Age must not be negative: " + newAge);
        }
        age = newAge;
    }

    public void setName(String name) {
        if(name == null){
            throw new NullPointerException("Name must not be null");
        }
        this.name = name;
    }

    public String getName_Handled(){
        try{
            return name.toUpperCase();
        } catch(NullPointerException e){
            System.out.println("Caught exception " + e);
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack trace: ");
            var stackTrace = e.getStackTrace();
            for(var element: stackTrace){
                System.out.println(" " + element);
            }

            return "No name";
        }
    }

    public void setVaccinationDate(String dateString) throws ParseException {
        vaccinationDate = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", vaccinationDate=" + vaccinationDate +
                '}';
    }
}