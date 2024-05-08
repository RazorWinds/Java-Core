import com.spartaglobal.refactoring.Refactoring;
import org.junit.jupiter.api.Assertions;   
import static org.junit.jupiter.api.Assertions.fail;
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
    void timeBoundryTest(){
        int[] times = {11, 12, 18, 19};
        Assertions.assertEquals("Good morning", Refactoring.getMessage(times[0]));
        Assertions.assertEquals("Good afternoon", Refactoring.getMessage(times[1]));
        Assertions.assertEquals("Good afternoon", Refactoring.getMessage(times[2]));
        Assertions.assertEquals("Good evening", Refactoring.getMessage(times[3]));
    }
    

}
