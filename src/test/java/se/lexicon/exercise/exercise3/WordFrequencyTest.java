
package se.lexicon.exercise.exercise3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

    @Test
    void testWordFrequency() {
        WordFrequency counter = new WordFrequency();

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");

        assertEquals(3, words.size());
        assertEquals(2, words.stream()
                .filter(word -> word.equals("apple"))
                .count());
        assertEquals(1, words.stream()
                .filter(word -> word.equals("banana"))
                .count());
    }

    @Test
    void testEmptyList() {
        WordFrequency counter = new WordFrequency();
        ArrayList<String> words = new ArrayList<>();

        assertDoesNotThrow(() -> counter.countWordFrequency(words));
    }
}
