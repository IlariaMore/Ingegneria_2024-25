public class ProductBuilder {

    private Product product;

    public ProductBuilder(){}

    public void setName(String name) {}

    public void setPrice(int price) {}

    public void setDescription(String description) {}

    public void setCreator(Seller seller) {}

    public void setSourceProduct(Product product) {}

    public ProducerProduct createProducerProduct() {
        return null;
    }

    public TransformerProduct createTransformerProduct() {
        return null;
    }
}
