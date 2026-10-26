package se.lexicon.workshops.workshop3;

import java.util.ArrayList;
import java.util.HashSet;

public class ContactManager {

    // Store unique contacts by phone number.
    private final HashSet<Contact> contacts = new HashSet<>();

    // Add a contact when its details are valid and its phone number is new.
    public boolean addContact(Contact contact) {
        if (!isValidContact(contact)) {
            return false;
        }
        return contacts.add(contact);
    }

    // Find a contact by phone number.
    public Contact searchContactByPhone(String phone) {
        if (phone == null || phone.isBlank()) {
            return null;
        }

        for (Contact contact : contacts) {
            if (phone.equals(contact.getPhone())) {
                return contact;
            }
        }
        return null;
    }

    // Delete a contact by phone number.
    public boolean deleteContact(String phone) {
        Contact contact = searchContactByPhone(phone);
        if (contact == null) {
            return false;
        }
        return contacts.remove(contact);
    }

    // Update a contact without allowing another contact's phone number to be reused.
    public boolean updateContact(String oldPhone, String newName, String newPhone, String newEmail) {
        Contact oldContact = searchContactByPhone(oldPhone);
        if (oldContact == null) {
            return false;
        }

        Contact updatedContact = new Contact(newName, newPhone, newEmail);
        if (!isValidContact(updatedContact)) {
            return false;
        }

        Contact phoneOwner = searchContactByPhone(newPhone);
        if (phoneOwner != null && !oldPhone.equals(phoneOwner.getPhone())) {
            return false;
        }

        // Remove the old contact before adding the updated one.
        contacts.remove(oldContact);
        boolean added = contacts.add(updatedContact);

        // Restore the old contact if the update cannot be saved.
        if (!added) {
            contacts.add(oldContact);
        }
        return added;
    }

    // Return an ArrayList copy for displaying contacts.
    public ArrayList<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }

    // Check that all required contact fields have values.
    private boolean isValidContact(Contact contact) {
        return contact != null
                && contact.getName() != null && !contact.getName().isBlank()
                && contact.getPhone() != null && !contact.getPhone().isBlank()
                && contact.getEmail() != null && !contact.getEmail().isBlank();
    }

    // Return contacts sorted alphabetically by name.
    public ArrayList<Contact> getAllContactsSortedByName() {
        ArrayList<Contact> sortedContacts = getAllContacts();

        // Sort names without considering uppercase or lowercase.
        sortedContacts.sort((contact1, contact2) ->
                contact1.getName().compareToIgnoreCase(contact2.getName()));

        return sortedContacts;
    }
}
