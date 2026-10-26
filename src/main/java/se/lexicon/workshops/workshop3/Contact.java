package se.lexicon.workshops.workshop3;

public class Contact {

    private final String name;
    private final String phone;
    private final String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Return the contact name.
    public String getName() {
        return name;
    }

    // Return the contact phone number.
    public String getPhone() {
        return phone;
    }

    // Return the contact email.
    public String getEmail() {
        return email;
    }

    // Treat contacts with the same phone number as the same contact.
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Contact other = (Contact) object;
        if (phone == null) {
            return other.phone == null;
        }
        return phone.equals(other.phone);
    }

    // Use the phone number as the contact's hash value.
    @Override
    public int hashCode() {
        return phone == null ? 0 : phone.hashCode();
    }
}
