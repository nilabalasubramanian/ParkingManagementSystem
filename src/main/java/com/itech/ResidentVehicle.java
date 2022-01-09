package com.itech;

public class ResidentVehicle extends Vehicle {
    private int flatNumber;
    private boolean parkingStatus;

    public ResidentVehicle(String regNo, String ownerName, long mobileNo,int flatNumber,boolean parkingStatus) {
        super(regNo, ownerName, mobileNo);
        this.flatNumber=flatNumber;
        this.parkingStatus=parkingStatus;
    }


    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public boolean isParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(boolean parkingStatus) {
        this.parkingStatus = parkingStatus;
    }
}
