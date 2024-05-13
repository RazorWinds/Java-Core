
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.spartaglobal.abstracttask.Square;
import org.junit.jupiter.api.Assertions;

public class HashTests {
    
    public HashTests() {
    }
    
    @Test
    @DisplayName("Reflective: ")
    void testingEqualsReflective(){
        Square sq1 = new Square(8.0);
        Assertions.assertEquals(true, sq1.equals(sq1));
    }
    
    @Test
    @DisplayName("Symetric: ")
    void testingEqualsSymetric(){
        Square sq1 = new Square(8.0);
        Square sq2 = new Square(8.0);
        Assertions.assertEquals(true, sq1.equals(sq2) && sq2.equals(sq1));
    }
    
    @Test
    @DisplayName("Transitive: ")
    void testingEqualsTransitive(){
        Square sq1 = new Square(8.0);
        Square sq2 = new Square(8.0);
        Square sq3 = new Square(8.0);
       
        
        Assertions.assertEquals(true, sq1.equals(sq2));
        Assertions.assertEquals(true, sq2.equals(sq3));
        Assertions.assertEquals(true, sq1.equals(sq3));
    }
}
