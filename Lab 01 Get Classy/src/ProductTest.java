import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product("Pipeweed", "Long Bottom Leaf", "000001", 600.0);
    }

    @Test
    void testConstructorAndGetters() {
        assertEquals("Pipeweed", product.getName());
        assertEquals("Long Bottom Leaf", product.getDescription());
        assertEquals("000001", product.getID());
        assertEquals(600.0, product.getCost(), 0.001);
    }

    @Test
    void testSetters() {
        product.setName("Lembas");
        product.setDescription("Elven Wayfare Bread");
        product.setCost(200.0);

        assertEquals("Lembas", product.getName());
        assertEquals("Elven Wayfare Bread", product.getDescription());
        assertEquals(200.0, product.getCost(), 0.001);
    }

    @Test
    void testToCSV() {
        String expected = "000001,Pipeweed,Long Bottom Leaf,600.00";
        assertEquals(expected, product.toCSV());
    }

    @Test
    void testToJSON() {
        String expected = "{\"ID\":\"000001\",\"name\":\"Pipeweed\",\"description\":\"Long Bottom Leaf\",\"cost\":600.00}";
        assertEquals(expected, product.toJSON());
    }

    @Test
    void testToXML() {
        String expected = "<product><ID>000001</ID><name>Pipeweed</name><description>Long Bottom Leaf</description><cost>600.00</cost></product>";
        assertEquals(expected, product.toXML());
    }

    @Test
    void testToString() {
        String expected = "Product{ID='000001', name='Pipeweed', description='Long Bottom Leaf', cost=600.00}";
        assertEquals(expected, product.toString());
    }
}