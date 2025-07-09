import java.util.ArrayList;

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

    public boolean subscribe(Buyer buyer) {
        return false;
    }

    public boolean unsubscribe(Buyer buyer) {
        return false;
    }
}
