package db;

import model.Vehicle;

import java.util.ArrayList;

public class VehicleDB {
    public static ArrayList<Vehicle> vehicleList=new ArrayList<Vehicle>();

    static{
        vehicleList.add(new Vehicle("NA-3434","Bus","3500","60"));
        vehicleList.add(new Vehicle("KA-4536","Van","1000","7"));
        vehicleList.add(new Vehicle("58-3567","Van","1500","4"));
        vehicleList.add(new Vehicle("GF-4358","Van","800","4"));
        vehicleList.add(new Vehicle("CCB-3568","Van","1800","8"));
        vehicleList.add(new Vehicle("LM-6679","Van","1500","4"));
        vehicleList.add(new Vehicle("QA-3369","Van","1800","6"));
        vehicleList.add(new Vehicle("KB-3668","Cargo Lorry","2500","2"));
        vehicleList.add(new Vehicle("JJ-9878","Cargo Lorry","3000","2"));
        vehicleList.add(new Vehicle("GH-5772","Cargo Lorry","4000","3"));
        vehicleList.add(new Vehicle("XY-4456","Cargo Lorry","3500","2"));
        vehicleList.add(new Vehicle("YQ-3536","Cargo Lorry","2000","2"));
        vehicleList.add(new Vehicle("CBB-3566","Cargo Lorry","2500","2"));
        vehicleList.add(new Vehicle("QH-3444","Cargo Lorry","5000","4"));

    }
}

