import com.spartaglobal.advancedjunit.Counter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTests {
 
    private Counter sut;
    @BeforeEach
    void setUpAll() {
        sut =  new Counter(6);
    }
 
    @Test
    void decrement_DecrementCountByOne() {
        sut.decrement();
        Assertions.assertEquals(5, sut.getCount());
    }
 
    @Test
    void increment_IncreaseCountByOne() {
        sut.increment();
        Assertions.assertEquals(7, sut.getCount());
    }
}
