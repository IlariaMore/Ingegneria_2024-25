import java.util.ArrayList;

/**
*
* This class represents an event.
*
* @author Erika Aguiari, Ilaria Morettini, Luca Barchiesi
*
*/
public class Event implements Visitable{

    private String name;

    private int maxAttendees;

    private String description;

    private int id;

    private static int currentId;

    private ArrayList<Seller> collaborators;

    private ArrayList<Buyer> subscribers;

    public Event(){}

    
    private static int getCurrentId() {
        return currentId;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxAttendees() {
        return maxAttendees;
    }

    public void setMaxAttendees(int maxAttendees) {
        this.maxAttendees = maxAttendees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Seller> getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(ArrayList<Seller> collaborators) {
        this.collaborators = collaborators;
    }

    /**
    *
    * This method is used by a buyer to subscribe to an event.
    *
    * @param buyer, the buyer who wants to subscribe to an event.
    *
    * @return @true if the operation ended successfully, false otherwise.
    *
    */
    public boolean subscribe(Buyer buyer) {
        return false;
    }

    /**
    *
    * This method is used by a buyer to unsubscribe to an event.
    *
    * @param buyer, the buyer who wants to unsubscribe to an event.
    *
    * @return true if the operation ended successfully, false otherwise.
    *
    */
    public boolean unsubscribe(Buyer buyer) {
        return false;
    }
}
