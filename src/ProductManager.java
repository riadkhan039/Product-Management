
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static volatile ProductManager instance;
    private List<Product> products;

    private ProductManager() {
        products = new ArrayList<>();
    }

    public static ProductManager getInstance() {
        if (instance == null) {
            synchronized (ProductManager.class) {
                if (instance == null) {
                    instance = new ProductManager();
                }
            }
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                p.setName(product.getName());
                p.setDescription(product.getDescription());
                p.setPrice(product.getPrice());
                p.setQuantity(product.getQuantity());
                p.setSize(product.getSize());
                p.setColor(product.getColor());
                p.setMaterial(product.getMaterial());
            }
        }
    }

    public void deleteProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public Product getProductDetails(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}

