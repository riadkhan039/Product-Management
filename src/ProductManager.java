import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    private static ProductManager instance;
    private Map<Integer, ProductInterface> inventory;

    private ProductManager() {
        inventory = new HashMap<>();
    }

    public static synchronized ProductManager getInstance() {
        if (instance == null) {
            instance = new ProductManager();
        }
        return instance;
    }

    public boolean addProduct(ProductInterface product) {
        if (!inventory.containsKey(product.getId())) {
            inventory.put(product.getId(), product);
            return true;
        }
        return false;
    }

    public boolean updateProductDetails(ProductInterface product) {
        if (inventory.containsKey(product.getId())) {
            inventory.put(product.getId(), product);
            return true;
        }
        return false;
    }

    public boolean deleteProductFromInventory(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            return true;
        }
        return false;
    }

    public ProductInterface getProductDetails(int productId) {
        return inventory.get(productId);
    }
}
