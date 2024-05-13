
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.spartaglobal.abstracttask.Square;
import org.junit.jupiter.api.Assertions;

public class ComparableTest {

    public ComparableTest() {
    }

    @Test
    @DisplayName("Rule 1: ")
    void testingRule1() {
        Square sq1 = new Square(8.0);
        Square sq2 = new Square(12.0);
        
        Assertions.assertEquals(1, sq1.compareTo(sq2));
        Assertions.assertEquals(1, -sq2.compareTo(sq1));
    }
    
    @Test
    @DisplayName("Rule 2 transistive: ")
    void testingRule2() {
        Square sq1 = new Square(8.0);
        Square sq2 = new Square(12.0);
        Square sq3 = new Square(20.0);
        
        Assertions.assertEquals(1, sq1.compareTo(sq2));
        Assertions.assertEquals(1, sq2.compareTo(sq3));
        Assertions.assertEquals(1, sq1.compareTo(sq3));
    }

    
    @Test
    @DisplayName("Rule 3: ")
    void testingRule3() {
        Square sq1 = new Square(8.0);
        Square sq2 = new Square(8.0);
        Square sq3 = new Square(20.0);
        
        Assertions.assertEquals(0, sq1.compareTo(sq2));
        Assertions.assertEquals(true, (sq2.compareTo(sq3) == sq1.compareTo(sq3)));
  
    }
}
