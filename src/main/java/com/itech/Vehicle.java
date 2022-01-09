package com.itech;

public class Vehicle {
    private String regNo;
    private String ownerName;
    private long mobileNo;

    public Vehicle(String regNo, String ownerName, long mobileNo) {
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.mobileNo = mobileNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
}
