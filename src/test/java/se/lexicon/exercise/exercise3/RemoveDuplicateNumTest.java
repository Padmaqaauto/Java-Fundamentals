
package se.lexicon.exercise.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateNumTest {

    RemoveDuplicateNum remover;
    ArrayList<Integer> numbers;

    @BeforeEach
    void setUp() {
        remover = new RemoveDuplicateNum();
        numbers = remover.getNumList();
    }

    @Test
    @DisplayName("Remove Duplicates from the list")
    void removeDuplicatesFromTheList(){
        ArrayList<Integer> expected = new ArrayList<>(
                Arrays.asList(4, 7, 2, 9, 1, 3)
        );
        ArrayList<Integer> actual = remover.removeDuplicates(numbers);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Removing duplicates with empty list")
    void removeDuplicatesWithEmptyList(){

        numbers.clear();
        assertThrows(
                IllegalArgumentException.class,
                () -> remover.removeDuplicates(numbers)
        );
    }

}
