public class LightVehicle extends Vehicle {

    public String numberOfSeats;

    public LightVehicle(String plateNumber, String engineCapacity, String make, String model, String year, String ownerID, String numberOfSeats) {
        super (plateNumber, engineCapacity, make, model, year, ownerID);
        this.numberOfSeats = numberOfSeats;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String toString() {
        return super.toString() + "\nNumber of Seats: " + numberOfSeats;
    }
}
