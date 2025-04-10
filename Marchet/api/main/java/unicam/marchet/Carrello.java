public class Carrello {

  private ArrayList<Prodotto> list;

  public Carrello() {
    list = new ArrayList<>();
  }

  public void addProdotto(Prodotto p) {list.add(p)}

  public void deleteProdotto(Prodotto p) {list.remove(p)}
  
}
