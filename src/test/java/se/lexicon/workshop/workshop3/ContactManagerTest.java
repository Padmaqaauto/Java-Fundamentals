package se.lexicon.workshop.workshop3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.lexicon.workshops.workshop3.Contact;
import se.lexicon.workshops.workshop3.ContactManager;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContactManagerTest {

    private ContactManager contactManager;

    // Create a fresh manager before each test.
    @BeforeEach
    void setUp() {
        contactManager = new ContactManager();
    }

    // ADD CONTACT: positive test.
    @Test
    @DisplayName("Add a new contact")
    void addContactPositiveTest() {
        Contact contact =
                new Contact("Alice", "111", "alice@example.com");

        assertTrue(contactManager.addContact(contact));
        assertEquals(1, contactManager.getAllContacts().size());
    }

    // ADD CONTACT: negative test.
    @Test
    @DisplayName("Reject a duplicate phone number")
    void addContactNegativeTest() {
        contactManager.addContact(
                new Contact("Alice", "111", "alice@example.com"));

        Contact duplicate =
                new Contact("Bob", "111", "bob@example.com");

        assertFalse(contactManager.addContact(duplicate));
        assertEquals(1, contactManager.getAllContacts().size());
    }

    // SEARCH CONTACT: positive test.
    @Test
    @DisplayName("Find a contact by phone")
    void searchContactPositiveTest() {
        contactManager.addContact(
                new Contact("Alice", "111", "alice@example.com"));

        Contact result =
                contactManager.searchContactByPhone("111");

        assertEquals("Alice", result.getName());
    }

    // SEARCH CONTACT: negative test.
    @Test
    @DisplayName("Return null when contact does not exist")
    void searchContactNegativeTest() {
        Contact result =
                contactManager.searchContactByPhone("999");

        assertNull(result);
    }

    // DELETE CONTACT: positive test.
    @Test
    @DisplayName("Delete an existing contact")
    void deleteContactPositiveTest() {
        contactManager.addContact(
                new Contact("Alice", "111", "alice@example.com"));

        assertTrue(contactManager.deleteContact("111"));
        assertNull(contactManager.searchContactByPhone("111"));
    }

    // DELETE CONTACT: negative test.
    @Test
    @DisplayName("Do not delete a missing contact")
    void deleteContactNegativeTest() {
        assertFalse(contactManager.deleteContact("999"));
        assertTrue(contactManager.getAllContacts().isEmpty());
    }

    // UPDATE CONTACT: positive test.
    @Test
    @DisplayName("Update an existing contact")
    void updateContactPositiveTest() {
        contactManager.addContact(
                new Contact("Alice", "111", "alice@example.com"));

        boolean result = contactManager.updateContact(
                "111",
                "Alice Smith",
                "222",
                "alice.smith@example.com");

        assertTrue(result);
        assertNull(contactManager.searchContactByPhone("111"));

        Contact updatedContact =
                contactManager.searchContactByPhone("222");

        assertEquals("Alice Smith", updatedContact.getName());
        assertEquals("alice.smith@example.com", updatedContact.getEmail());
    }

    // UPDATE CONTACT: negative test.
    @Test
    @DisplayName("Do not update a missing contact")
    void updateContactNegativeTest() {
        boolean result = contactManager.updateContact(
                "999",
                "Bob",
                "222",
                "bob@example.com");

        assertFalse(result);
        assertTrue(contactManager.getAllContacts().isEmpty());
    }

    // GET ALL CONTACTS: positive test.
    @Test
    @DisplayName("Return all contacts")
    void getAllContactsPositiveTest() {
        contactManager.addContact(
                new Contact("Alice", "111", "alice@example.com"));

        contactManager.addContact(
                new Contact("Bob", "222", "bob@example.com"));

        assertEquals(2, contactManager.getAllContacts().size());
    }

    // GET ALL CONTACTS: negative test.
    @Test
    @DisplayName("Return an empty list when no contacts exist")
    void getAllContactsNegativeTest() {
        assertTrue(contactManager.getAllContacts().isEmpty());
    }

    // SORT CONTACTS: positive test.
    @Test
    @DisplayName("Sort contacts alphabetically by name")
    void sortContactsPositiveTest() {
        contactManager.addContact(
                new Contact("Zara", "333", "zara@example.com"));

        contactManager.addContact(
                new Contact("alice", "111", "alice@example.com"));

        contactManager.addContact(
                new Contact("Bob", "222", "bob@example.com"));

        ArrayList<Contact> sortedContacts =
                contactManager.getAllContactsSortedByName();

        // Store the sorted names.
        ArrayList<String> actualNames = new ArrayList<>();

        for (Contact contact : sortedContacts) {
            actualNames.add(contact.getName());
        }

        // Define the expected order.
        ArrayList<String> expectedNames = new ArrayList<>();
        expectedNames.add("alice");
        expectedNames.add("Bob");
        expectedNames.add("Zara");

        assertEquals(expectedNames, actualNames);
    }

    // SORT CONTACTS: negative or empty-state test.
    @Test
    @DisplayName("Return an empty list when there are no contacts to sort")
    void sortContactsNegativeTest() {
        ArrayList<Contact> sortedContacts =
                contactManager.getAllContactsSortedByName();

        assertTrue(sortedContacts.isEmpty());
    }
}
