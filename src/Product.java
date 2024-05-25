public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String size;
    private String color;
    private String material;

    // Constructor
    public Product(int id, String name, String description, double price, int quantity, String size, String color, String material) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
        this.material = material;
    }

    // Getter and Setter methods

    // Returns the product ID
    public int getId() {
        return id;
    }

    // Sets the product ID
    public void setId(int id) {
        this.id = id;
    }

    // Returns the product name
    public String getName() {
        return name;
    }

    // Sets the product name
    public void setName(String name) {
        this.name = name;
    }

    // Returns the product description
    public String getDescription() {
        return description;
    }

    // Sets the product description
    public void setDescription(String description) {
        this.description = description;
    }

    // Returns the product price
    public double getPrice() {
        return price;
    }

    // Sets the product price
    public void setPrice(double price) {
        this.price = price;
    }

    // Returns the product quantity
    public int getQuantity() {
        return quantity;
    }

    // Sets the product quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Returns the product size
    public String getSize() {
        return size;
    }

    // Sets the product size
    public void setSize(String size) {
        this.size = size;
    }

    // Returns the product color
    public String getColor() {
        return color;
    }

    // Sets the product color
    public void setColor(String color) {
        this.color = color;
    }

    // Returns the product material
    public String getMaterial() {
        return material;
    }

    // Sets the product material
    public void setMaterial(String material) {
        this.material = material;
    }
}
