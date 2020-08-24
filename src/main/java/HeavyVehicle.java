public class HeavyVehicle extends Vehicle {

    public String loadCapacity;

    public HeavyVehicle(String plateNumber, String engineCapacity, String make, String model, String year, String ownerID, String loadCapacity) {
        super(plateNumber, engineCapacity, make, model, year, ownerID);
        this.loadCapacity = loadCapacity;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return super.toString() + "\nLoad Capacity: " + loadCapacity;
    }
}
