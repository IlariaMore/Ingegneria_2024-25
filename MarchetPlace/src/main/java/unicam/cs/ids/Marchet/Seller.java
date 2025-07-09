import javax.swing.text.html.HTML;
import java.util.ArrayList;

public class Seller {

    private String name;

    private String description;

    private Location location;

    private ArrayList<Tag> tags;

    private int id;

    private static int currentId;

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

    public boolean addProduct() {
        return false;
    }

    public boolean removeProduct() {
        return false;
    }
}
