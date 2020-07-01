package pl.wkos.homework81;

import static pl.wkos.homework81.StrUtil.putNewLineAndTabs;

public class Trainer extends Person {
    private Contact contact;
    private String subject;
    private String education;
    private String professionalExperience;

    public Trainer(String firstName, String lastName, String dateOfBirth, String placeOfBirth,
                   Contact contact, String subject, String education, String professionalExperience) {
        super(firstName, lastName, dateOfBirth, placeOfBirth);
        this.contact = contact;
        this.subject = subject;
        this.education = education;
        this.professionalExperience = professionalExperience;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " urodzony " + getDateOfBirth() + " w " +
                getPlaceOfBirth() + putNewLineAndTabs(4) +
                "Kontakt" + putNewLineAndTabs(5) + contact + putNewLineAndTabs(4) +
                "Przedmiot" + putNewLineAndTabs(5) + subject + putNewLineAndTabs(4) +
                "Wykształcenie" + putNewLineAndTabs(5) + education + putNewLineAndTabs(4) +
                "Doświadczenie zawodowe" + putNewLineAndTabs(5) + professionalExperience;
    }
}
