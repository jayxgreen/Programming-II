import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testProductConstructor() {
        Product product = new Product("Laptop", 999.99);
        assertEquals("Laptop", product.getName());
        assertEquals(999.99, product.getUnitPrice());
    }

    @Test
    public void testSetProductName() {
        Product product = new Product("Laptop", 999.99);
        product.setName("Desktop");
        assertEquals("Desktop", product.getName());
    }

    @Test
    public void testSetUnitPrice() {
        Product product = new Product("Laptop", 999.99);
        product.setUnitPrice(1199.99);
        assertEquals(1199.99, product.getUnitPrice());
    }
}