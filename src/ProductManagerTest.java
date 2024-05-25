
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerTest {
    private ProductManager productManager;

    @BeforeEach
    public void setUp() {
        productManager = ProductManager.getInstance();
    }

    @AfterEach
    public void tearDown() {
        // Clear the product list after each test
        productManager.getAllProducts().clear();
    }

    @Test
    public void testAddProduct() {
        Product product = new Product(1, "T-Shirt", "A cool T-Shirt", 19.99, 100, "M", "Blue", "Cotton");
        productManager.addProduct(product);
        assertEquals(1, productManager.getAllProducts().size());
    }

    @Test
    public void testUpdateProduct() {
        Product product = new Product(1, "T-Shirt", "A cool T-Shirt", 19.99, 100, "M", "Blue", "Cotton");
        productManager.addProduct(product);
        Product updatedProduct = new Product(1, "T-Shirt", "An awesome T-Shirt", 29.99, 100, "M", "Blue", "Cotton");
        productManager.updateProduct(updatedProduct);
        assertEquals("An awesome T-Shirt", productManager.getProductDetails(1).getDescription());
    }

    @Test
    public void testDeleteProduct() {
        Product product = new Product(1, "T-Shirt", "A cool T-Shirt", 19.99, 100, "M", "Blue", "Cotton");
        productManager.addProduct(product);
        productManager.deleteProduct(1);
        assertNull(productManager.getProductDetails(1));
    }

    @Test
    public void testGetProductDetails() {
        Product product = new Product(1, "T-Shirt", "A cool T-Shirt", 19.99, 100, "M", "Blue", "Cotton");
        productManager.addProduct(product);
        Product retrievedProduct = productManager.getProductDetails(1);
        assertEquals(product, retrievedProduct);
    }
}

