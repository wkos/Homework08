package pl.wkos.homework82;

import static pl.wkos.homework81.StrUtil.putNewLineAndTabs;

public class Student extends Person {
    private Contact contact;
    private int term;

    public Student(String firstName, String lastName, String dateOfBirth,
                   String placeOfBirth, Contact contact, int term) {
        super(firstName, lastName, dateOfBirth, placeOfBirth);
        this.contact = contact;
        this.term = term;
    }

    public String showBasicDataOfStudent() {
        return getFirstName() + " " + getLastName() + " urodzony " + getDateOfBirth();
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " urodzony " + getDateOfBirth() + " w " +
                getPlaceOfBirth() + putNewLineAndTabs(4) +
                "Kontakt" + putNewLineAndTabs(5) + contact + putNewLineAndTabs(4) +
                "Semstr " + term;
    }
}
