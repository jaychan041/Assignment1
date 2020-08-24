public class CorporateOwner extends Owner {

    private String australianBusinessNumber;

    public CorporateOwner (String licenceNumber, String firstName, String lastName, String address, String phoneNumber, String australianBusinessNumber){
        super(licenceNumber, firstName, lastName, address, phoneNumber);
        this.australianBusinessNumber = australianBusinessNumber;
    }

    public String getAustralianBusinessNumber() {
        return australianBusinessNumber;
    }

    public void setAustralianBusinessNumber(String australianBusinessNumber) {
        this.australianBusinessNumber = australianBusinessNumber;
    }

    public String toString(){
        return "ABN: " + australianBusinessNumber + "\n" +super.toString();
    }


}
