package se.lexicon.exercise.exercise3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public Map<String, String> createPhoneBook(){
            Map<String, String> phonebook = new HashMap<>();

            phonebook.put("Alice", "0789712346");
            phonebook.put("Bob", "0702345678");
            phonebook.put("Charlie", "0703456789");
            phonebook.put("David", "0704567890");

            return phonebook;
    }

    public String findContacts(Map<String, String> contacts, String name){
            if(contacts == null || name == null){
                throw new IllegalArgumentException("Contact or Name cannot be null");
            }

            String phoneNumber = contacts.get(name);

            if(phoneNumber == null){
                return "Contact not found.";
            }

            return phoneNumber;
    }



    void main(){
        PhoneBook book = new PhoneBook();
        Map<String, String> contacts = book.createPhoneBook();

        Scanner input = new Scanner(System.in);
        IO.println("Enter user name to look up for the contacts: ");
        String name = input.nextLine();

        String result = book.findContacts(contacts, name);

        IO.println(result);

        input.close();
    }
}
