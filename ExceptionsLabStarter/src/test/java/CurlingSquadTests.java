
import curling_exercise.CurlingSquad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class CurlingSquadTests {

    @Test
    @DisplayName(("Add some curlers"))
    public void testAddSomeCurlers() {
        CurlingSquad squadSparta = new CurlingSquad("Sparta");
        String[] availableCurlers = new String[]{"Cathy", "Nikki", "Alicja", "Elena"};
        Assertions.assertEquals(4, squadSparta.addCurlers(availableCurlers));
    }

    @Test
    @DisplayName(("Try to add too many curlers"))
    public void testAddTooManyCurlers() {
        CurlingSquad squadSparta = new CurlingSquad("Sparta");
        String[] availableCurlers = new String[]{"Cathy", "Nikki", "Alicja", "Elena"};
        Assertions.assertEquals(4, squadSparta.addCurlers(availableCurlers));
        String[] moreCurlers = new String[]{"Parmita", "Millie", "Jasmine"};
        Assertions.assertEquals(5, squadSparta.addCurlers(moreCurlers));
    }

    @Test
    @DisplayName(("Testing an exception"))
    public void testException() {
        CurlingSquad squadSparta = new CurlingSquad("Sparta");
        String[] availableCurlers = new String[]{"Cathy", "Nikki", "Alicja", "Elena", "Parmita"};
        squadSparta.addCurlers(availableCurlers);
        Throwable e = Assertions.assertThrows(Exception.class, () -> squadSparta.addCurler("Nish"));
        assertThat("Squad is full", is(e.getMessage()));
    }
}
