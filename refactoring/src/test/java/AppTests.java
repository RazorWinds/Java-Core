import com.spartaglobal.refactoring.Refactoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;




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
    

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 11})
    @DisplayName("@Parameterized - Good morning")
    void timeBoundryTest2(int timeBoundry){
        Assertions.assertEquals("Good morning", Refactoring.getMessage(timeBoundry));
    }
   
    
    @ParameterizedTest
    @ValueSource(ints = {12, 15, 18})
    @DisplayName("@Parameterized - Good afternoon")
    void timeBoundryTest3(int timeBoundry){
        Assertions.assertEquals("Good afternoon", Refactoring.getMessage(timeBoundry));
    }
    
    
    @ParameterizedTest
    @ValueSource(ints = {19, 20})
    @DisplayName("@Parameterized - Good evening")
    void timeBoundryTest4(int timeBoundry){
        Assertions.assertEquals("Good evening", Refactoring.getMessage(timeBoundry));
    }
}
