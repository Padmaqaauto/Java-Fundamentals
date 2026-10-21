package se.lexicon.exercise.exercise3;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MergeListsTest {

    MergeLists merger;
    ArrayList<Integer> listA;
    ArrayList<Integer> listB;

    @BeforeEach
    void setup() {
        merger = new MergeLists();
        listA = merger.getListA();
        listB = merger.getListB();
    }

    @Test
    @DisplayName("Remove Duplicates from lists before Merging")
    void removeDuplicatesBeforeMerging() {
        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        ArrayList<Integer> actual = merger.mergeLists(listA, listB);

        assertEquals(expected.size(), actual.size());
        assertTrue(actual.containsAll(expected));
    }

    @Test
    @DisplayName("Empty List after merging when both lists are empty")
    void mergeEmptyList(){
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        ArrayList<Integer> actual = merger.mergeLists(listA, listB);

        assertTrue(actual.isEmpty());
        assertEquals(0, actual.size());
    }

    @Test
    @DisplayName("Throw Exception when List is null")
    void nullList(){
        listA.clear();
        listB.clear();

        assertThrows(
                IllegalArgumentException.class,
                () -> merger.mergeLists(null, listB)
        );
    }
}
