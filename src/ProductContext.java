
public class ProductContext {
    private ProductState state;

    public ProductContext() {
        state = null;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public ProductState getState() {
        return state;
    }
}
