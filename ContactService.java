import java.util.ArrayList;

public class ContactService {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contact.getContactId())) {
                throw new IllegalArgumentException("Contact ID already exists.");
            }
        }
        contacts.add(contact);
    }

    public void deleteContact(String contactId) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactId().equals(contactId)) {
                contacts.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("Contact not found.");
    }

    public void updateFirstName(String contactId, String newFirstName) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                c.setFirstName(newFirstName);
                return;
            }
        }
        throw new IllegalArgumentException("Contact not found.");
    }

    public void updateLastName(String contactId, String newLastName) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                c.setLastName(newLastName);
                return;
            }
        }
        throw new IllegalArgumentException("Contact not found.");
    }

    public void updatePhone(String contactId, String newPhone) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                c.setPhone(newPhone);
                return;
            }
        }
        throw new IllegalArgumentException("Contact not found.");
    }

    public void updateAddress(String contactId, String newAddress) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                c.setAddress(newAddress);
                return;
            }
        }
        throw new IllegalArgumentException("Contact not found.");
    }

    public Contact getContact(String contactId) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                return c;
            }
        }
        return null;
    }
}