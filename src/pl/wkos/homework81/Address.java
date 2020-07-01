package pl.wkos.homework81;

public class Address {
    private String residentialAddress;
    private String houseNumber;
    private String flatNumber;
    private String residentialCity;
    private String residentialAreaCode;

    public Address(String residentialAddress, String houseNumber, String flatNumber,
                   String residentialCity, String residentialAreaCode) {
        this.residentialAddress = residentialAddress;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.residentialCity = residentialCity;
        this.residentialAreaCode = residentialAreaCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "residentialAddress='" + residentialAddress + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", residentialCity='" + residentialCity + '\'' +
                ", residentialAreaCode='" + residentialAreaCode + '\'' +
                '}';
    }
}
