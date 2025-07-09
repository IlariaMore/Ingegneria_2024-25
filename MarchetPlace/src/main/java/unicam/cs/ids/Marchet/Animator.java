public class Animator {

    private String name;

    private String description;

    private EventBoard eventBoard;

    private int id;

    private static int currentId;

    public Animator() {}

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

    public int getId() {
        return id;
    }

    public Event createEvent() {
        return null;
    }

    public boolean deleteEvent(Event event) {
        return false;
    }
}
