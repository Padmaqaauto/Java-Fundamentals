package se.lexicon.exercise.exercise3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ShoppingListTest {

    ShoppingList shoppingList;
    ArrayList<String> items;

    @BeforeEach
    void setup() {
        shoppingList = new ShoppingList();
        items = shoppingList.createShoppingList();
    }

    @Test
    @DisplayName("Verify that five items are added")
    void printShoppingList() {

        shoppingList.printItems(items);

        assertEquals(5, items.size());
        assertTrue(items.contains("Bread"));
        assertTrue(items.contains("Cheese"));
        assertTrue(items.contains("Rice"));
        assertTrue(items.contains("Coffee"));
        assertTrue(items.contains("Pizza"));
    }

    @Test
    @DisplayName("Remove an item from the List")
    void removeItem() {
        shoppingList.removeItem(items, "Cheese");

        shoppingList.printItems(items);

        assertFalse(items.contains("Cheese"));

        assertEquals(4, items.size());
        assertTrue(items.contains("Bread"));
        assertTrue(items.contains("Rice"));
        assertTrue(items.contains("Coffee"));
        assertTrue(items.contains("Pizza"));
    }
}
