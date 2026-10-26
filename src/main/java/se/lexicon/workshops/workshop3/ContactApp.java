package se.lexicon.workshops.workshop3;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactApp {

    private final Scanner scanner = new Scanner(System.in);
    private final ContactManager contactManager = new ContactManager();

    void main() {
        // Start the console application.
        start();
    }

    // Show the menu until the user chooses to exit.
    private void start() {
        String choice;

        do {
            showMenu();
            choice = readMenuChoice();

            switch (choice) {
                case "1":
                    addContact();
                    break;
                case "2":
                    searchContact();
                    break;
                case "3":
                    showAllContacts();
                    break;
                case "4":
                    updateContact();
                    break;
                case "5":
                    deleteContact();
                    break;
                case "0":
                    IO.println("Goodbye!");
                    break;
            }

        } while (!choice.equals("0"));

        // Close keyboard input.
        scanner.close();
    }

    // Print the available operations.
    private void showMenu() {
        IO.println("\n=== Contact Management App ===");
        IO.println("1. Add contact");
        IO.println("2. Search contact by phone");
        IO.println("3. Show all contacts");
        IO.println("4. Update contact");
        IO.println("5. Delete contact");
        IO.println("0. Exit");
    }

    // Accept only valid menu choices.
    private String readMenuChoice() {
        while (true) {
            String choice = readInput("Choose an option (0-5): ");

            if (choice.matches("[0-5]")) {
                return choice;
            }

            IO.println("Invalid choice. Enter a number from 0 to 5.");
        }
    }

    // Read and add a contact.
    private void addContact() {
        String name = readName("Enter name: ");
        String phone = readPhone("Enter phone: ");
        String email = readEmail("Enter email: ");

        Contact contact = new Contact(name, phone, email);

        if (contactManager.addContact(contact)) {
            IO.println("Contact added successfully.");
        } else {
            IO.println("Could not add contact. Phone number may already exist.");
        }
    }

    // Search for a contact.
    private void searchContact() {
        String phone = readPhone("Enter phone to search: ");
        Contact contact = contactManager.searchContactByPhone(phone);

        if (contact == null) {
            IO.println("Contact not found.");
        } else {
            printContact(contact);
        }
    }

    // Display all contacts sorted by name.
    private void showAllContacts() {
        ArrayList<Contact> allContacts =
                contactManager.getAllContactsSortedByName();

        if (allContacts.isEmpty()) {
            IO.println("No contacts found.");
            return;
        }

        for (Contact contact : allContacts) {
            printContact(contact);
        }
    }

    // Update an existing contact.
    private void updateContact() {
        String oldPhone = readPhone(
                "Enter the phone number of the contact to update: ");

        // Check whether the contact exists before asking for new details.
        if (contactManager.searchContactByPhone(oldPhone) == null) {
            IO.println("Contact not found.");
            return;
        }

        String newName = readName("Enter new name: ");
        String newPhone = readPhone("Enter new phone: ");
        String newEmail = readEmail("Enter new email: ");

        if (contactManager.updateContact(
                oldPhone, newName, newPhone, newEmail)) {
            IO.println("Contact updated successfully.");
        } else {
            IO.println("Could not update contact. Phone number may already exist.");
        }
    }

    // Delete a contact.
    private void deleteContact() {
        String phone = readPhone("Enter phone to delete: ");

        if (contactManager.deleteContact(phone)) {
            IO.println("Contact deleted successfully.");
        } else {
            IO.println("Contact not found.");
        }
    }

    // Read input and remove extra spaces.
    private String readInput(String message) {
        IO.print(message);
        return scanner.nextLine().trim();
    }

    // Accept a non-empty name.
    private String readName(String message) {
        while (true) {
            String name = readInput(message);

            if (!name.isBlank() && name.matches("[\\p{L} .'-]+")) {
                return name;
            }

            IO.println("Invalid name. Use letters, spaces, apostrophes, dots or hyphens.");
        }
    }

    // Accept digits with an optional leading plus sign.
    private String readPhone(String message) {
        while (true) {
            String phone = readInput(message);

            if (phone.matches("\\+?[0-9]{7,15}")) {
                return phone;
            }

            IO.println("Invalid phone. Enter 7-15 digits, optionally starting with +.");
        }
    }

    // Check a basic email format.
    private String readEmail(String message) {
        while (true) {
            String email = readInput(message);

            if (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
                return email;
            }

            IO.println("Invalid email. Example: name@example.com");
        }
    }

    // Print one contact.
    private void printContact(Contact contact) {
        IO.println("Name: " + contact.getName());
        IO.println("Phone: " + contact.getPhone());
        IO.println("Email: " + contact.getEmail());
        IO.println("----------------------");
    }
}
