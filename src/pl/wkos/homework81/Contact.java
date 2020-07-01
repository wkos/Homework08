package pl.wkos.homework81;

public class Contact {
    private String email;
    private String phoneNumber;
    private String residentialAddress;
    private String residentialCity;
    private String residentialAreaCode;

    public Contact(String email, String phoneNumber, String residentialAddress,
                   String residentialCity, String residentialAreaCode) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.residentialAddress = residentialAddress;
        this.residentialCity = residentialCity;
        this.residentialAreaCode = residentialAreaCode;
    }

    @Override
    public String toString() {
        return "email: " + email + ", telefon: " + phoneNumber + ", ulica: " + residentialAddress +
                ", miasto: " + residentialCity + ", kod pocztowy: " + residentialAreaCode;
    }
}
