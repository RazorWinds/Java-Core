
import com.spartaglobal.exceptionhandling.Animal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AnimalTests {

    public AnimalTests() {
    }

    @ParameterizedTest
    @CsvSource(
            {
                "0,0",
                "10,10"
            }
    )
    @DisplayName("Give an age of 0 or above, setAge changes the age")
    public void setAgeHappyPath(int newAge, int expectedAge) throws ParseException {
        Animal sut = new Animal();
        sut.setAge(newAge);
        Assertions.assertEquals(expectedAge, sut.getAge());
    }

    @ParameterizedTest
    @NullSource
    @DisplayName("Given null, setName throws a NullPointerException with message 'Name must not be null'")
    public void setNameSadPath(String input) throws NullPointerException {
        Animal sut = new Animal();
        var exception = Assertions.assertThrows(NullPointerException.class, () -> sut.setName(input));
        Assertions.assertEquals("Name must not be null", exception.getMessage());
    }

    @Test
    @DisplayName("Given a non-null String s, setName sets name to s")
    public void setNameHappyPath() {
        Animal sut = new Animal();
        sut.setName("Logan");
        Assertions.assertEquals("Logan".toUpperCase(), sut.getName());
    }

    @ParameterizedTest(name = "{0} should not throw")
    @ValueSource(strings = {"12-01-2020", "30-09-2024", "01-01-2025"})
    @DisplayName("Given correct dates an exception should not be thrown.")
    public void setVacDateHappy(String dateString) throws ParseException{
        Animal sut = new Animal();
        Date expected = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
        
        sut.setVaccinationDate(dateString);
        Assertions.assertEquals(expected, sut.getVaccinationDate());
    }

    @ParameterizedTest(name = "{0} should throw")
    @ValueSource(strings = {"120-12-2020", "3009.2024", "0101-2025"})
    @DisplayName("Given incorrect dates, an exception should be thrown.")
    public void setVacDateSad(String dateString)  {
        Animal sut = new Animal();
        Assertions.assertThrows(ParseException.class, () -> sut.setVaccinationDate(dateString));
    }
}
