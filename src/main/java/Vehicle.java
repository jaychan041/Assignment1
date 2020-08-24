public class Vehicle {

    private String plateNumber;
    private String engineCapacity;
    private String make;
    private String model;
    private String year;
    private String ownerID;

    public Vehicle(String plateNumber, String engineCapacity, String make, String model, String year, String ownerID) {
        this.plateNumber = plateNumber;
        this.engineCapacity = engineCapacity;
        this.make = make;
        this.model = model;
        this.year = year;
        this.ownerID = ownerID;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    @Override
    public String toString() {
        return "Owner ID: " + ownerID + "\nPlate Number: " + plateNumber + "Vehicle: " + year + " " + make + " " + model + "\nEngine Capacity: " + engineCapacity + "L";

    }
}
