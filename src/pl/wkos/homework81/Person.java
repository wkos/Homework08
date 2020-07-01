package pl.wkos.homework81;

public class Person {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String placeOfBirth;

    public Person(String firstName, String lastName, String dateOfBirth, String placeOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Imię " + firstName + " Nazwisko: " + lastName + ", urodzony " +
                dateOfBirth + ", w " + placeOfBirth + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
}
