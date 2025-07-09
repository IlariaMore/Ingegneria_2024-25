import javax.swing.text.html.HTML;
import java.util.ArrayList;


/**
*
* This class is used to represent a seller.
*
* @author Erika Aguiari, Ilaria Morettini, Luca Barchiesi
*
*/
public class Seller {

    private String name;

    private String description;

    private Location location;

    private ArrayList<Tag> tags;

    private int id;

    private static int currentId;

    
    /**
    *
    * This method creates an object Seller.
    *
    * @return an object Seller.
    *
    */
    public Seller() {}

    private static int getCurrentId() {
        return currentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public int getId() {
        return id;
    }

    
    /**
    *
    * This method is used to add a product to the marketplace.
    *
    * @return true if the product is added successfully, false otherwise.
    *
    */
    public boolean addProduct() {
        return false;
    }

    /**
    *
    * This method is used to remove a product from the marketplace.
    *
    * @return true if the product is removed successfully, false otherwise.
    *
    */
    public boolean removeProduct() {
        return false;
    }
}
