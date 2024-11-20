import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    public void testCustomerConstructor() {
        Customer customer = new Customer("John Doe", "123 Main St");
        assertEquals("John Doe", customer.getName());
        assertEquals("123 Main St", customer.getAddress());
    }

    @Test
    public void testSetName() {
        Customer customer = new Customer("John Doe", "123 Main St");
        customer.setName("Jane Smith");
        assertEquals("Jane Smith", customer.getName());
    }

    @Test
    public void testSetAddress() {
        Customer customer = new Customer("John Doe", "123 Main St");
        customer.setAddress("456 Elm St");
        assertEquals("456 Elm St", customer.getAddress());
    }
}