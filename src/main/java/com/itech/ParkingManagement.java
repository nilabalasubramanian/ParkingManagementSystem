package com.itech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingManagement {
    List<Vehicle> allVehicles;
    public ParkingManagement() {
        allVehicles = new ArrayList<Vehicle>();
    }
    public String addVehicle(Vehicle vehicle)throws ParkingSlotNotAvailableException
    {
        if(allVehicles.size()>=10)
         throw new ParkingSlotNotAvailableException();
         allVehicles.add(vehicle);
         return "Vehicle parked at Parking Slot no :2" +allVehicles.size();
    }
    public String setVisitorVehicleOutTime(final String regNo, int outTime)throws VehicleNotFoundException
    {
       List<Vehicle>ve=allVehicles.stream().filter(i-> i instanceof VisitorVehicle).filter(j->j.getRegNo().equals(regNo)).collect(Collectors.toList());
       if(ve.isEmpty())
       throw new VehicleNotFoundException();
        ((VisitorVehicle)ve.get(0)).setOutTime(outTime);
        return "Vehicle with regno"+regNo+"updated successfully";
    }
    public int getParkedResidentVehicleCount()
    {
        return (int) allVehicles.stream().filter(i-> i instanceof ResidentVehicle).filter(j->((ResidentVehicle) j).isParkingStatus()).count();

    }
   public void displayAllVehicles()
   {
       allVehicles.stream().forEach(System.out::println);
   }

}
