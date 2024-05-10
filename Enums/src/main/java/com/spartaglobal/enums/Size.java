package com.spartaglobal.enums;


public enum Size {
    SMALL("Small Pizza", 500),
    MEDIUM("Medium Pizza", 680),
    LARGE("Large Pizza", 920),
    EXTRALARGE("Extra Large Pizza", 1200);

    // Delcated a private variable to hold the pizza size description
    private final String pizzaSize;
    private final int calories;
    // Ctor initialises the pizzaSize variable for each enum constant
    Size(String pizzaSize, int calories) {
        this.pizzaSize = pizzaSize;
        this.calories = calories;
    }

    public String getPizzaSize(){
        return pizzaSize;
    }
    
    public int getPizzaCalories(){
        return calories;
    }
    
    public int getEnergyInJoules(){
        return (int)(calories *  4.184);
    }
}

