package src.com.cloudbees.trainbooking.model;

public class Ticket {
    // Properties
    private User user;
    private int price;

    // Constructor
    public Ticket(User user, int price) {
        this.user = user;
        this.price = price;
    }

    // Methods
    public User getUser() {
        return user;
    }

    public int getPrice() {
        return price;
    }
}
