
package se.lexicon.exercise.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SubmissionTrackerTest {

    SubmissionTracker tracker;

    // Creates a fresh tracker before every test
    @BeforeEach
    public void setup() {
        tracker = new SubmissionTracker();
    }

    @Test
    @DisplayName("Duplicate submission should be rejected")
    void rejectDuplicates() {

        // Arrange
        ArrayList<String> students = new ArrayList<>(
                Arrays.asList("John", "Jane", "John")
        );

        // Act
        tracker.submitHomework(students);

        // Assert: Only two unique students should be stored
        assertEquals(2, tracker.getSubmittedStudents().size());
        assertTrue(tracker.getSubmittedStudents().contains("John"));
        assertTrue(tracker.getSubmittedStudents().contains("Jane"));
    }

    @Test
    @DisplayName("Empty list should return zero submissions")
    void emptyListTest() {

        // Arrange
        ArrayList<String> students = new ArrayList<>();

        // Act
        tracker.submitHomework(students);

        // Assert
        assertEquals(0, tracker.getSubmittedStudents().size());
    }

    @Test
    @DisplayName("Null list should throw IllegalArgumentException")
    void nullListTest() {

        // Act and Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> tracker.submitHomework(null)
        );
    }

    @Test
    @DisplayName("Student list should contain ten submissions")
    void getStudentListTest() {

        // Act
        ArrayList<String> students = tracker.getStudentList();

        // Assert
        assertEquals(10, students.size());
    }
}
