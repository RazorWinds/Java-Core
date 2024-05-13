package com.sparta;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
       return (temp < 15) ? "It's cold" : "It's hot";
    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums)
    {   
        if (nums.length == 0) {return 0;}
        
        int added = 0;
        for (int num : nums) {
            added += num;
        }
        
        return (double)added/(double)nums.length;
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age)
    {        
        String ticketType = "Free";
        if (age >= 60) {
            ticketType = "OAP";
        }else if (age >= 18){
            ticketType = "Standard";
        }else if (age >= 13){
            ticketType = "Student";
        }else if (age >= 5) {
            ticketType = "Child";
        }
        return ticketType;
    }

    // Question 4
    public static String grade(int mark)
    {
        StringBuilder gradeBuilder = new StringBuilder();
        if (mark >= 40){
            gradeBuilder.append("Pass");
            if (mark >= 60){
                gradeBuilder.append(" with Merit");
            }else if (mark >= 75) {
                gradeBuilder.append(" with Distinction");
            }
        }else{
            gradeBuilder.append("Fail");
        } 
        return gradeBuilder.toString();
    }

    // Question 5
    public static int getScottishMaxWeddingNumber(int covidLevel)
    {
        switch (covidLevel){
            case 0:
                return 200;
            case 1:
                return 100;
            case 2:
                return 50;
            case 3:
                return 50;
            case 4:
                return 20;
        }
        return 0;
    }
}
