package src.com.cloudbees.trainbooking.model;

public class User {
    // Properties
    private String firstName;
    private String lastName;
    private String email;

    // Constructor
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Methods
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }
}
