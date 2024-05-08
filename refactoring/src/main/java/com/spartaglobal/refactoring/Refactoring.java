

package com.spartaglobal.refactoring;


public class Refactoring {

   public static void main(String[] args){
        int timeOfDay = 21;
        String msg = getMessage(timeOfDay);
        System.out.println(msg);
    }

    private static String getMessage(int timeOfDay) {
        String outputMessage;
        if (timeOfDay >= 5 && timeOfDay <= 12){
            outputMessage = "Good Morning";
        }else if (timeOfDay >= 12 && timeOfDay <= 18){
            outputMessage = "Good afternoon";
        }else {
            outputMessage = "Good evening";
        }
        return outputMessage;
    }
}
