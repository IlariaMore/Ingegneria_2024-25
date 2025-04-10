public interface Market {
  private Database database;

  // richiamato dall'acquirente 
  public void showProducts();
  // richiamati dal venditore
  public void deleteproduct(Vendor v, Product p);
  public void addProduct(Vendor v, Product p)
}
