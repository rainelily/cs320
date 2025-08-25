import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        assertEquals("John", service.getContact("123").getFirstName());
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.deleteContact("123");
        assertNull(service.getContact("123"));
    }

    @Test
    public void testUpdatePhone() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.updatePhone("123", "0987654321");
        assertEquals("0987654321", service.getContact("123").getPhone());
    }

    @Test
    public void testUpdateAddress() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.updateAddress("123", "456 Avenue");
        assertEquals("456 Avenue", service.getContact("123").getAddress());
    }
}