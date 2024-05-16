package com.spartaglobal.collectionstask;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsTask {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        outputArray(array);

        array[2] = 2;
        outputArray(array);

        
        
        // ArrayLit
        ArrayList<String> names = new ArrayList<>();

        names.add("Terry");
        names.add("Karen");
        names.add("Fred");
        names.add("Jimmy");
        names.add("Brenda");

        for (String name : names) {
            System.out.println(name);
        }

        ArrayList<String> newNames = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if (i == 2) {
                newNames.add("Bob");
            } else {
                newNames.add(names.get(i));
            }
        }

        for (String name : newNames) {
            System.out.println(name);
        }
    
        HashMap<String, Integer> map = new HashMap<>();
        map.put("JAN", 31);
        map.put("FEB", 31);
        
        for (String i: map.keySet()) {
            int value = map.get(i);
        }
       
    }

    public static void outputArray(int[] arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
