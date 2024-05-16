package com.spartaglobal.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

public class CollectionsTasks {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>(
                List.of("Terry", "Karen", "Fred", "Jimmy", "Brenda")
        );

        for (String name : names) {
            System.out.println(name);
        }
        names.add("Fred");
        System.out.println(names);

        HashSet<String> moreNames = new HashSet<>(
                List.of("Carol", "Brenda", "Jeffrey", "Albert", "Terry")
        );
        HashSet<String> allNames = new HashSet<>();
        allNames.addAll(names);
        allNames.addAll(moreNames);

        System.out.println(allNames);

        List<String> menu = Arrays.asList(
                "Classic Burger", "BBQ Chicken Burger", "Spicy Beef Burger", "Veggie Burger",
                "Mac & Cheese", "Cod & Chips", "Vegetable Chilli", "Beef Lasagne", "Steak & Ale Pie",
                "Hunters Chicken", "Gammon Steak", "8oz Aged Rump", "Mixed Grill"
        );
        List<String> mealsIFancy = Arrays.asList(
                "Roast Lunch", "Chicken Madras", "Cod & Chips", "Vegetable Chilli", "Cottage Pie",
                "Steak & Ale Pie", "Beans on Toast", "Classic Burger", "Beef Lasagne"
        );

        HashSet<String> outputMeals = new HashSet<>(menu);
        outputMeals.retainAll(mealsIFancy);
        outputMeals.forEach(menuItem -> System.out.println(menuItem));

        String message = "The cat in the hat comes back".trim().toLowerCase();
        HashMap<Character, Integer> lettersCount = new HashMap<>();

        for (char letter : message.toCharArray()) {

            if (lettersCount.containsKey(letter)) {
                lettersCount.put(letter, lettersCount.get(letter) + 1);
            } else {
                lettersCount.put(letter, 1);
            }
        }
        for (char letter : message.toCharArray()) {
            lettersCount.put(letter, lettersCount.getOrDefault(letter, 0) + 1);
        }

        System.out.println(lettersCount);

        Person john = new Person("John", "Doe");

        Person joe = new Person("Joe", "Bloggs");

        Person frank = new Person("Frank", "Bloggs");

        List<Person> people = new ArrayList<>(List.of(john, frank, joe));

        Collections.sort(people);

        people.forEach(System.out::println);
    }

    public static HashSet<Integer> makeFiveSet(int max) {
        HashSet<Integer> divBy5Set = new HashSet<>();
        for (int i=5; i <= max; i += 5){
           divBy5Set.add(i);
        }
        return divBy5Set;
    }
    
    public static List<String> longWordList(String sentance){
        ArrayList<String> array = new ArrayList<>();
        for (String word : sentance.split("\\s")) {
            if (word.length() >= 5){
                array.add(word);
            }
        }
        
        return array;
    }
}
