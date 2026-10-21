package se.lexicon.exercise.exercise3;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LargestNumberTest {

    LargestNumber largeNum;
    ArrayList<Integer> numbers;

    @BeforeEach
    void setup(){
        largeNum = new LargestNumber();
        numbers = largeNum.getNumberList();
    }

    @Test
    @DisplayName("Print the number list")
    void printNumberList(){
        largeNum.printList(numbers);

        assertEquals(8, numbers.size());
        assertTrue(numbers.contains(14));
        assertTrue(numbers.contains(3));
        assertTrue(numbers.contains(78));
        assertTrue(numbers.contains(45));
        assertTrue(numbers.contains(91));
        assertTrue(numbers.contains(7));
        assertTrue(numbers.contains(56));
    }

    @Test
    @DisplayName("Find the Largest number")
    void findLargestNumber(){
        int result = largeNum.findLargestNum(numbers);
        assertEquals(91, result);
    }

    @Test
    @DisplayName("Throw exception when list is empty")
    void testEmptyList(){
        numbers.clear();

        assertThrows(
                IllegalArgumentException.class,
                () -> largeNum.findLargestNum(numbers)
        );
    }
}
