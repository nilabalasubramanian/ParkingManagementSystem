package com.itech;

public class ParkingSlotNotAvailableException extends Exception{
    public ParkingSlotNotAvailableException(String message) {
        super(message);
    }

    public ParkingSlotNotAvailableException() {
    }
}
