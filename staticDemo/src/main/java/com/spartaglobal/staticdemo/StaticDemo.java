package com.spartaglobal.staticdemo;

public class StaticDemo {

    public static void main(String[] args) {
        Spartan phil = new Spartan();

        Spartan manish = new Spartan();

        phil.setName("Phil");

        manish.setName("Manish");

        System.out.println(phil.getName());

        System.out.println(manish.getName());

        Customer cathy = new Customer("Cathy");
        Customer nish = new Customer("Nish");
        System.out.println(cathy.getName());
        System.out.println(nish.getName());
        System.out.println(cathy);
        System.out.println(nish);
    }

}
