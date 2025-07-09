public class TransformerProduct extends Product {

    private Product sourceProduct;

    public TransformerProduct() {}


    public Product getSourceProduct() {
        return sourceProduct;
    }

    public void setSourceProduct(Product sourceProduct) {
        this.sourceProduct = sourceProduct;
    }
}
