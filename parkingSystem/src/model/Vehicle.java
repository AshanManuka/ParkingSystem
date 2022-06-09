package model;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private String weight;
    private String passanger;

    public Vehicle(String vehicleNumber, String vehicleType, String weight, String passanger) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.weight = weight;
        this.passanger = passanger;
    }

    public Vehicle() {
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPassanger() {
        return passanger;
    }

    public void setPassanger(String passanger) {
        this.passanger = passanger;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", weight='" + weight + '\'' +
                ", passanger='" + passanger + '\'' +
                '}';
    }
}
