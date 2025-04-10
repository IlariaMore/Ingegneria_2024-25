import java.util.ArrayList;

public class Kart {

  private ArrayList<Product> kart;

  public Kart() {
    list = new ArrayList<>();
  }

  public void addProduct(Product p) {kart.add(p)}

  public void deleteProduct(Product p) {kart.remove(p)}
  
}
