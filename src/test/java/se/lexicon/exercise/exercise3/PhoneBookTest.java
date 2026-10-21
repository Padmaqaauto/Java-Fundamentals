package se.lexicon.exercise.exercise3;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PhoneBookTest {

    PhoneBook phoneBook;
    Map<String, String> contacts;

    @BeforeEach
    void setup(){
        phoneBook = new PhoneBook();
        contacts = phoneBook.createPhoneBook();
    }

    @Test
    @DisplayName("Verify Phone Book contains four contacts")
    void testPhoneBook(){
        assertEquals(4, contacts.size());
    }

    @Test
    @DisplayName("Verify for contact in phonebook")
    void fetchTrueContact(){
        String phoneNumber = phoneBook.findContacts(contacts, "Alice");
        assertEquals("0789712346", phoneNumber);
    }

    @Test
    @DisplayName("Verify message when contact is not found")
    void testContactNotFound() {
        String result = phoneBook.findContacts(contacts, "Meera");

        assertEquals("Contact not found.", result);
    }

    @Test
    @DisplayName("Verify null contact map throws exception")
    void testNullContacts() {
        assertThrows(
                IllegalArgumentException.class,
                () -> phoneBook.findContacts(null, "Alice")
        );
    }

    @Test
    @DisplayName("Verify null name throws exception")
    void testNullName() {
        assertThrows(
                IllegalArgumentException.class,
                () -> phoneBook.findContacts(contacts, null)
        );
    }
}
