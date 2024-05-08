import com.spartaglobal.refactoring.Refactoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




public class AppTests {
    
    
    public AppTests() {
    }

    @Test
    @DisplayName("My first test")
    void firstTest(){
        Assertions.assertTrue(true);
    }

    
    @Test
    @DisplayName("TOD message boundry tests")
    void timeBoundryTest(){
        int[] boundries = {11, 12, 18, 19};
        Assertions.assertEquals("Good morning", Refactoring.getMessage(boundries[0]));
        Assertions.assertEquals("Good afternoon", Refactoring.getMessage(boundries[1]));
        Assertions.assertEquals("Good afternoon", Refactoring.getMessage(boundries[2]));
        Assertions.assertEquals("Good evening", Refactoring.getMessage(boundries[3]));
    }
    

}
