package com.cloudbees.trainbooking.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSection {
    // Properties
    private List<User> sectionASeats;
    private List<User> sectionBSeats;

    // Constructor
    public TrainSection() {
        sectionASeats = new ArrayList<>();
        sectionBSeats = new ArrayList<>();
    }

    // Methods
    public void allocateUserToSection(User user, String section) {
        if ("A".equalsIgnoreCase(section)) {
            sectionASeats.add(user);
        } else if ("B".equalsIgnoreCase(section)) {
            sectionBSeats.add(user);
        }
    }

    public Map<String, List<User>> getAllSeats() {
        Map<String, List<User>> allSeats = new HashMap<>();
        allSeats.put("A", sectionASeats);
        allSeats.put("B", sectionBSeats);
        return allSeats;
    }

    public List<User> getSeatsInSection(String section) {
        if ("A".equalsIgnoreCase(section)) {
            return sectionASeats;
        } else if ("B".equalsIgnoreCase(section)) {
            return sectionBSeats;
        } else {
            // Handle invalid section
            return new ArrayList<>();
        }
    }

    public User getUserByEmail(String email) {
        for (User user : sectionASeats) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        for (User user : sectionBSeats) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null; // User not found
    }

    public void removeUser(User user) {
        sectionASeats.remove(user);
        sectionBSeats.remove(user);
    }
}
