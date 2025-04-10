public class Kart {

  private ArrayList<Product> list;

  public Kart() {
    list = new ArrayList<>();
  }

  public void addProduct(Product p) {list.add(p)}

  public void deleteProduct(Product p) {list.remove(p)}
  
}
