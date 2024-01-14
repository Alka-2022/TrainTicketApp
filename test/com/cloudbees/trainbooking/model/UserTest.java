// File: test/com/cloudbees/trainbooking/model/UserTest.java

package test.com.cloudbees.trainbooking.model;

import org.junit.jupiter.api.Test;

import src.com.cloudbees.trainbooking.model.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testGetFullName() {
        User user = new User("John", "Doe", "john.doe@example.com");
        assertEquals("John Doe", user.getFullName());
    }

    @Test
    public void testGetEmail() {
        User user = new User("John", "Doe", "john.doe@example.com");
        assertEquals("john.doe@example.com", user.getEmail());
    }
}
