public class Owner {

    private String licenceNumber;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public Owner(String licenceNumber, String firstName, String lastName, String address, String phoneNumber) {
        this.licenceNumber = licenceNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return "Licence Number: " + licenceNumber + "\nName: " + firstName + " " + lastName + "\nAddress: " + address + "\nPhone No: " + phoneNumber;
    }
}
