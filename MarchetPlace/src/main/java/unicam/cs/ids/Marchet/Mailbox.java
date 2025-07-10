import java.util.ArrayList;

public class Mailbox {

    private ArrayList<String> mailbox;

    public void addMessage(String message) {
        mailbox.add(message);
    }

    public void refreshMailbox() {
        mailbox.clear();
    }
}
