import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testValidContact() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        assertEquals("123", contact.getContactId());
    }

    @Test
    public void testInvalidContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678910", "John", "Doe", "1234567890", "123 Street");
        });
    }

    @Test
    public void testSetPhoneInvalid() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("123");
        });
    }

    @Test
    public void testSetFirstNameValid() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Street");
        contact.setFirstName("Jane");
        assertEquals("Jane", contact.getFirstName());
    }
}