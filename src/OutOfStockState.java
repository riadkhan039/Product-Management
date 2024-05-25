
public class OutOfStockState implements ProductState {
    @Override
    public void handleState(ProductContext context) {
        context.setState(this);
        System.out.println("Product is out of stock.");
    }
}
