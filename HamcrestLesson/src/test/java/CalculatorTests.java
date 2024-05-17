
import com.spartaglobal.hamcrestlesson.Calculator;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    void given2And6_Add_Returns8Pt0() {

        Calculator calc = new Calculator(6, 2);

        //Assertions.assertEquals(8.0, calc.add());
        MatcherAssert.assertThat(calc.add(), is(8.0));
    }

    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {

        Calculator calc = new Calculator(6, 2);

        //Assertions.assertTrue(calc.divisibleBy());
        MatcherAssert.assertThat(calc.divisibleBy(), is(true));

    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {

        Calculator calc = new Calculator(7, 3);

        //Assertions.assertFalse(calc.divisibleBy());
        MatcherAssert.assertThat(calc.divisibleBy(), is(false));

    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {

        Calculator calc = new Calculator(7, 3);

        //Assertions.assertTrue(calc.toString().contains("Calculator"));
        MatcherAssert.assertThat(calc.toString(), containsString("Calculator"));
    }

    @Test
    void moreStringMatchers() {
        var testString = "The quick brown fox jumps over the lazy dog.";

        MatcherAssert.assertThat(testString, startsWith("The"));
        MatcherAssert.assertThat(testString, endsWith("dog."));
        MatcherAssert.assertThat(testString, containsStringIgnoringCase("the quick"));
        MatcherAssert.assertThat(testString, stringContainsInOrder("quick", "jumps", "lazy"));
        MatcherAssert.assertThat(testString, not(emptyOrNullString()));
    }

    @Test
    void collectionMatchersExercise() {
        List<String> fruit = List.of(
                "apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon");

        MatcherAssert.assertThat(fruit, hasSize(7));
        String[] order = {"apple", "banana", "pomegranate", "lemon"};
        MatcherAssert.assertThat(fruit, containsInRelativeOrder(order));
        String[] nonOrdered = {"banana", "pear"};
        MatcherAssert.assertThat(fruit, hasItems(nonOrdered));
        String[] nonOrdered2 = {"lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"};
        MatcherAssert.assertThat(fruit, containsInAnyOrder(nonOrdered2));
        MatcherAssert.assertThat(fruit, not(contains("Grape")));

        MatcherAssert.assertThat(fruit, not(hasItem(endsWithIgnoringCase("Z"))));
    }

    @Test
    void given7And3_ToString_OutputContainsCalculator2() {

        Calculator calc = new Calculator(7, 3);

        MatcherAssert.assertThat(
                calc.toString(),
                allOf(
                        containsString("Calculator"),
                        containsString("7"),
                        containsString("3")
                ));

        MatcherAssert.assertThat(
                calc.toString(),
                anyOf(
                        containsString("NotCalculator"),
                        containsString("7"),
                        containsString("10")
                ));
    }
}
