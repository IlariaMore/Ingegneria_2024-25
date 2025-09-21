/**
*
* This method creates an object Product.
*
* @return an object Product.
*
*/
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

    public Mailbox getMailbox(mailbox) {
        return mailbox;
    }

    
    /**
    *
    * This method adds a product to the shopping cart.
    *
    * @param product, the product that needs to be added.
    *
    * @return true if the product is added successfully, false otherwise.
    *
    */
    public boolean addToShoppingCart(Product product) {
        return false;
    }

    
    /**
    *
    * This method is used to buy all the products in the shopping cart.
    *
    * @return true if the products are sold successfully, false otherwise.
    *
    */
    public boolean buyShoppingCart(){
        return false;
    }

    
    /**
    *
    * This method is used to buy a ticket of an event.
    *
    * @param event, the event from which the user is buying the ticket.
    *
    * @return true if the event ticket is sold successfully, false otherwise.
    *
    */
    public boolean buyEventTicket(Event event) {
        return false
    }

    
    /**
    *
    * This method is used to update the buyer about the event status.
    *
    * @param event, the event that is being observed.
    *
    */
    public void update(Event event) {}

    
    /**
    *
    * This method is used to open the user mailbox;
    *
    */
    public void openMailbox() {
    }

    
    /**
    *
    * This method is used to refresh the mailbox.
    *
    */
    public void refreshMailbox() {
        mailbox.refresh();
    }
}
