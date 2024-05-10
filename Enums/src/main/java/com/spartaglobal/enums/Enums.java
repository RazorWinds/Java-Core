package com.spartaglobal.enums;


public class Enums {
    public static void main(String[] args) {

        Day dayOfWeek;
        dayOfWeek = Day.SUNDAY;
        if (dayOfWeek == Day.SATURDAY || dayOfWeek == Day.SUNDAY) {
            System.out.println("It is the weekend :)");
        } else {
            System.out.println("It is a weekday :(");
        }
    }
}
