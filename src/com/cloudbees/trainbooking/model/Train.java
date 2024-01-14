package com.cloudbees.trainbooking.model;

public class Train {
    // Properties
    private String trainId;

    // Constructor
    public Train(String trainId) {
        this.trainId = trainId;
    }

    // Methods
    public String getTrainId() {
        return trainId;
    }
}
