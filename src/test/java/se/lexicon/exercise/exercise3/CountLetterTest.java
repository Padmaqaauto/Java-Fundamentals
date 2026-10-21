
package se.lexicon.exercise.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class CountLetterTest {

    CountLetter counter;
    ArrayList<String> names;

    @BeforeEach
    void setUp() {
        counter = new CountLetter();
        names = counter.getNamesList();
    }

    @Test
    @DisplayName("Count names starting with A")
    void testCountNamesStartingWithA() {
        assertEquals(4, counter.countNames(names, 'A'));
    }

    @Test
    @DisplayName("Verify counting is case-insensitive")
    void testCountNamesLowercaseA() {
        assertEquals(4, counter.countNames(names, 'a'));
    }

    @Test
    @DisplayName("Return zero when no names match")
    void testNoMatchingNames() {
        assertEquals(0, counter.countNames(names, 'Z'));
    }

    @Test
    @DisplayName("Return zero for an empty list")
    void testEmptyList() {
        names = new ArrayList<>();

        assertEquals(0, counter.countNames(names, 'A'));
    }

    @Test
    @DisplayName("Throw exception when names list is null")
    void testNullList() {
        assertThrows(
                IllegalArgumentException.class,
                () -> counter.countNames(null, 'A')
        );
    }
}
