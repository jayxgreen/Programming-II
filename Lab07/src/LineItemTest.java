import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LineItemTest {

    @Test
    public void testLineItemConstructor() {
        Product product = new Product("Laptop", 999.99);
        LineItem lineItem = new LineItem(product, 2);
        assertEquals(product, lineItem.getProduct());
        assertEquals(2, lineItem.getQuantity());
    }

    @Test
    public void testGetTotal() {
        Product product = new Product("Laptop", 999.99);
        LineItem lineItem = new LineItem(product, 2);
        assertEquals(1999.98, lineItem.getTotal());
    }

    @Test
    public void testSetProduct() {
        Product product = new Product("Laptop", 999.99);
        LineItem lineItem = new LineItem(product, 2);
        Product newProduct = new Product("Desktop", 1199.99);
        lineItem.setProduct(newProduct);
        assertEquals(newProduct, lineItem.getProduct());
    }

    @Test
    public void testSetQuantity() {
        Product product = new Product("Laptop", 999.99);
        LineItem lineItem = new LineItem(product, 2);
        lineItem.setQuantity(3);
        assertEquals(3, lineItem.getQuantity());
    }
}