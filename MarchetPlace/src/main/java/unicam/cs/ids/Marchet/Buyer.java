public class Buyer {
    private String name;

    private ShoppingCart shoppingCart;

    private Mailbox mailbox;

    private int id;

    private static int currentId;

    private static int getCurrentId() {
        return currentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public boolean addToShoppingCart(Product product) {
        return false;
    }

    public boolean buyShoppingCart(){
        return false;
    }

    public boolean buyEventTicket(Event event) {

    }

    public void update(Event event) {}

    public Mailbox getMailbox() {
        return mailbox;
    }
}
