public interface Market {
  private Database database;

  public void showProducts();
  public void deleteproduct(Vendor v, Product p);
  public void addProduct(Vendor v, Product p)
}
