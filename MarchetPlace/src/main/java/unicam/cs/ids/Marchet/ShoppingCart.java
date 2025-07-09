import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<QuantifiedProduct> quantifiedProducts;

    private float totalPrice;

    public boolean addQuantifiedProduct(QuantifiedProduct quantifiedProduct) {
        return false;
    }

    public boolean removeQuantifiedProduct(QuantifiedProduct quantifiedProduct) {
        return false;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    private void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ArrayList<QuantifiedProduct> getQuantifiedProducts() {
        return quantifiedProducts;
    }
}
