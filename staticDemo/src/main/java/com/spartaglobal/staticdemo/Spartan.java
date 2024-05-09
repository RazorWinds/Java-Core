package com.spartaglobal.staticdemo;

class Spartan {

    private static String name;

    static {
        name = "No name assigned";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
