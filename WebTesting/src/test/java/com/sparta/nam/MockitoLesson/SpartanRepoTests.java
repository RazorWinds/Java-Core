package com.sparta.nam.MockitoLesson;

import mockito.SpartanRepository;
import mockito.Spartan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.time.LocalDate;

public class SpartanRepoTests {
    SpartanRepository sut = new SpartanRepository();
    Spartan mock1 = Mockito.mock(Spartan.class);
    Spartan mock2 = Mockito.mock(Spartan.class);

    @BeforeEach
    public void setup() {
        sut.addSpartan(mock1);
        sut.addSpartan(mock2);

    }

    @Test
    @DisplayName("Test addSpartan")
    void testAddSpartan() {
        Assertions.assertEquals(2, sut.getNumSpartans());
    }


    @Test
    @DisplayName("Testing getSpartansCreatedLast24Hours")
    public void testingLast24Hours() {
        Mockito.when(mock1.getStartDate())
                .thenReturn(LocalDate.now().minusDays(3)
                );

        Mockito.when(mock2.getStartDate()).thenReturn(LocalDate.now());

        var newSpartans = sut.getSpartansCreatedLast24Hours();
        Assertions.assertEquals(1, newSpartans.size());
    }

    @Test
    public void testChangingName() {
        // arrange
        Mockito.when(mock1.getId()).thenReturn(3);
        Mockito.doThrow(IllegalArgumentException.class).when(mock1).setName(Mockito.any(String.class));
        // act and assert
        Assertions.assertFalse(sut.changeName(3, "Doris"));
    }

    @Test
    @DisplayName("Check methods are called in order")
    public void checkOrder() {
        sut.getAllSpartans();

        InOrder inOrder = Mockito.inOrder(mock2);
        inOrder.verify(mock2).getId();
        inOrder.verify(mock2).getName();
    }

    @Test
    @DisplayName("test correct parameter")
    public void testMethodIsCalledWithCorrectParameter() {
        Mockito.when(mock1.getId()).thenReturn(3);
        sut.changeName(3, "Cathy");
        Mockito.verify(mock1).setName("Cathy");
    }
}

