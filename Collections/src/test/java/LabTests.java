
import com.spartaglobal.collections.CollectionsTasks;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LabTests {
    
    public LabTests() {
    }
    
    
    
    @ParameterizedTest(name = "How many numbers are divisible by 5 up to {0}")
    @CsvSource({
    "5, 1",
    "10, 2",
    "0, 0",
    "100, 20"
    })
    void makeFiveSetTest(int maxNumber, int expectedOutput){
        HashSet<Integer> testSet = CollectionsTasks.makeFiveSet(maxNumber);
        Assertions.assertEquals(expectedOutput, testSet.size());
    }
    
    @ParameterizedTest(name = "{0} should have {1} long words")
    @CsvSource({
    "This has zero, 0",
    "Hello world, 2",
    "Steve, 1"
    })
    void longWordListTest(String sentance, int expectedOutput){
        List<String> testArray = CollectionsTasks.longWordList(sentance);
        Assertions.assertEquals(expectedOutput, testArray.size());
    }
}
