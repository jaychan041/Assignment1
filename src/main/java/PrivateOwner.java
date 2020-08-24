public class PrivateOwner extends Owner {

    private String dateOfBirth;

    public PrivateOwner(String licenceNumber, String firstName, String lastName, String address, String phoneNumber, String dateOfBirth) {
        super (licenceNumber, firstName, lastName, address, phoneNumber);
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return super.toString() + "\nDate of Birth: " + dateOfBirth;
    }
}
