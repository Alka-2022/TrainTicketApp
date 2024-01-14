// File: test/com/cloudbees/trainbooking/model/TrainTest.java

package test.com.cloudbees.trainbooking.model;

import org.junit.jupiter.api.Test;

import src.com.cloudbees.trainbooking.model.Train;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTest {

    @Test
    public void testGetTrainId() {
        Train train = new Train("123");
        assertEquals("123", train.getTrainId());
    }
}
