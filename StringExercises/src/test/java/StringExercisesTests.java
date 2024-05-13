
import com.spartaglobal.stringexercises.StringExercises;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;

public class StringExercisesTests {

    public StringExercisesTests() {

    }

    //Question 1
    @ParameterizedTest(name = "Words that start with {0}:")
    @CsvSource({"T, 2", "t, 2", "Z, 0"})
    @DisplayName("Count words test:")
    void question1Test(String letter, int expected) {
        String[] testData = {"The", "cat", "in", "the", "hat"};
        Assertions.assertEquals(expected, StringExercises.countWords(testData, letter.charAt(0)));
    }

    //Question 2
    @ParameterizedTest(name = "Words that start with {0}:")
    @CsvSource({"T, 2", "t, 2", "Z, 0"})
    @DisplayName("Count words in string test:")
    void question2Test(String letter, int expected) {
        String phrase = "The cat in the hat";
        Assertions.assertEquals(expected, StringExercises.countWordsInString(phrase, letter.charAt(0)));
    }

    //Question 3
    @ParameterizedTest(name = "Inputs: {0}, {1}")
    @CsvSource({
        "Cathy, 10, CATHY0123456789",
        ", 4, 0123",
        "Piano, 12, PIANO01234567891011"
    })
    @DisplayName("Transform test: ")
    void question3Test(String inputStr, int inputInt, String expected) {
        Assertions.assertEquals(expected, StringExercises.transformString(inputStr, inputInt));
    }

    //Question 4
    @ParameterizedTest(name = "Is {0} a palindrome:")
    @CsvSource({
        "civic, true",
        "MADam, true",
        "NotPalindrome, false",
        ",false"
    })
    @DisplayName("Palindrome test:")
    void question4Test(String word, boolean expected) {
        Assertions.assertEquals(expected, StringExercises.isPalindrome(word));
    }

    
    
    
    //=========== Lab - Strings, Equals and Hashcode -------------//
    @Test
    public void address_GivenItsComponents_ReturnsAFormattedAddressString() {
        var result = StringExercises.address(5, "Main Street", "Stone", "ST6 2RQ");
        var expAddress = "5 Main Street, Stone ST6 2RQ.";
        Assertions.assertEquals(expAddress, result);
    }

    @ParameterizedTest
    @CsvSource({
        "33, 40, You got 33 out of 40: 82.5%",
        "18, 65, You got 18 out of 65: 27.7%"
    })
    public void givenATestScore_Scorer_ReturnsAFormattedString(int score, int outOf, String expString) {
        var result = StringExercises.scorer(score, outOf);
        Assertions.assertEquals(expString, result);
    }

}
