package se.lexicon.practice.session3;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArrayDeclarationTest {

    @Test
    @DisplayName("Find max in a normal positive array (Happy Path)")
    public void findMaxNumberWithPositiveNumbers() {
        // Arrange
        int[] numbers = {12, 5, 45, 18, 33, 24};
        int expected = 45;

        // Act
        int actual = ArrayDeclaration.findMaxNumber(numbers);

        // Assert (Verify)
        assertEquals(expected, actual, "The maximum should be 45");
    }

    @Test
    @DisplayName("Find max in an array with negative numbers")
    public void findMaxNumberWithNegativeNumbers() {
        // Arrange
        int[] numbers = {-12, -5, -45, -18, -33, -24};
        int expected = -5;

        // Act
        int actual = ArrayDeclaration.findMaxNumber(numbers);

        // Assert (Verify)
        assertEquals(expected, actual, "The maximum should be -5");
    }

    @Test
    @DisplayName("Test findMaxNumber with null array (Negative Case)")
    public void findMaxNumberWithNullArray() {
        // Arrange
        int[] numbers = null;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () ->
                ArrayDeclaration.findMaxNumber(numbers), "Should throw IllegalArgumentException for null array");
    }

}
