
import com.spartaglobal.java_basics.Java_Basics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class Tests {
    
    public Tests() {
    }
    
    
    //Given an array of integers, convert them to a single int made up of the digits
    @Test
    @DisplayName("Testing array to integers")
    void test1(){
        int[] myArray = {1,2,3,4,5,6,7,8,9};
        Assertions.assertEquals(123456789, Java_Basics.arrayToNumber(myArray));
    }
    
    
    //Take a string and return it with all the vowels removed in uppercase
    @Test
    @DisplayName("Removing vowels")
    void test2(){
        String myString = "Hello from the other side";
        Assertions.assertEquals("HLL FRM TH THR SD", Java_Basics.removeVowels(myString));
    }
    
    
    @Test
    @DisplayName("Highest int in array")
    void test3(){
        int[] myArray = {1,2,3,4,5,6,7,8,9};
        Assertions.assertEquals(9, Java_Basics.highestInArray(myArray));
    }
    
    //For a String, create an array of all the duplicate letters
    @Test
    @DisplayName("Get duplicates")
    void test4(){
        char[] myArray = {'B','E', 'H'};
        String myString = "ABBCDEEEFGHH";
        Assertions.assertArrayEquals(myArray, Java_Basics.getDupclicates(myString));
    }
    
    
    //Create a 2 value array which counts all the consonants and vowels in a string
    @Test
    @DisplayName("Count letter units")
    void test5(){
        int[] myArray = {3,5};
        String myString = "FFFFFEEE";
        Assertions.assertArrayEquals(myArray, Java_Basics.countLetterUnits(myString));
    }
    
    
    //Write a method that takes a string and a letter and checks if the letter is in that string
    @Test
    @DisplayName("Does letter exist in string")
    void test6(){
        char letterToHunt = 'a';
        String myString = "Hello, world.";
        Assertions.assertFalse(Java_Basics.isInString(myString, letterToHunt));
    }
    
    
    //Give a sequence of numbers return the sum of all the numbers divisible by 2 and/or 3
    @Test
    @DisplayName("Idk what to call this")
    void test7(){
        int sequence = 12337;
        String myString = "Hello, world.";
        Assertions.assertEquals(8, Java_Basics.weirdSum(sequence));
    }
    
    //Write a method that takes a string and returns it with all the consonants in uppercase
     @Test
    @DisplayName("Constants to upper")
    void test8(){
        String myString = "Hello, world.";
        Assertions.assertEquals("HeLLo, WoRLD.", Java_Basics.consonantUpper(myString));
    }
}
