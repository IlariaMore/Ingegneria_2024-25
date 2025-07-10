import java.util.ArrayList;

public class RequestHandler {

    private ArrayList<Product> productRequests;

    private ArrayList<Event> eventRequests;

    public RequestHandler() {
        this.productRequests = new ArrayList<Product>();
        this.eventRequests = new ArrayList<Event>();
    }

    public boolean addProduct(Product product) {
        return productRequests.add(product);
    }

    public boolean removeProduct(Product product){
        return productRequests.remove(product);
    }

    public boolean addEvent(Event event) {
        return eventRequests.add(event);
    }

    public boolean removeEvent(Event event){
        return eventRequests.remove(event);
    }
}
