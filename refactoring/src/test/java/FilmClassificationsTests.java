import com.spartaglobal.refactoring.FilmClassification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


/*
==== Equivalence Partitions ====
00 -> 11 = R1
12 -> 14 = R2
15 -> 17 = R3
18 -> ?? = R4


==== 3 BVA ====
(Test input) --> (Expected Output)
00 --> R1
01 --> R1
10 --> R1
11 --> R1
12 --> R2
13 --> R2
14 --> R2
15 --> R3
16 --> R3
17 --> R3
18 --> R4
19 --> R4
*/


public class FilmClassificationsTests {
    @ParameterizedTest
    @ValueSource(ints = {0,1,10,11})
    @DisplayName("TC1 - Testing R1 boundries")
    void TC1(int testAge){
        Assertions.assertEquals("U & PG films are available.", FilmClassification.getClassificationsByAge(testAge));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {12,13,14})
    @DisplayName("TC2 - Testing R2 boundries")
    void TC2(int testAge){
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(testAge));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    @DisplayName("TC3 - Testing R3 boundries")
    void TC3(int testAge){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(testAge));
    }
    
    
    @ParameterizedTest
    @ValueSource(ints = {18, 19})
    @DisplayName("TC4 - Testing R4 boundries")
    void TC4(int testAge){
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(testAge));
    }
}
