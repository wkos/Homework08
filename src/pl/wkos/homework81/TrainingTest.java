package pl.wkos.homework81;

public class TrainingTest {
    public static void main(String[] args) {
        Group[] groups = new Group[2];
        groups[0] = new Group(1, "java", 3, 2);

        Contact[] contactTrainers = new Contact[2];
        Trainer[] trainers = new Trainer[2];

        contactTrainers[0] = new Contact("abacki@gmail.com", "111111111",
                "Zielona 11/1", "Kalisz", "62-800");
        trainers[0] = new Trainer("Jan", "Abacki", "30.05.1999",
                "Kalisz", contactTrainers[0], "java", "wyższe",
                "100 przeprowadzonych szkoleń z javy");
        groups[0].addTrainer(trainers[0]);

        contactTrainers[1] = new Contact("dabacki@gmail.com", "444444444",
                "Zielona 44/4", "Kalisz", "62-800");
        trainers[1] = new Trainer("Marek", "Dabacki", "30.05.1999",
                "Kalisz", contactTrainers[1], "C++", "wyższe",
                "50 przeprowadzonych szkoleń z C++");
        groups[0].addTrainer(trainers[1]);

        Contact[] contactStudents = new Contact[2];
        Student[] students = new Student[2];

        contactStudents[0] = new Contact("babacki@gmail.com", "222222222",
                "Czerwona 22/2", "Ostrów", "62-400");
        students[0] = new Student("Marek", "Babacki", "20.04.1989",
                "Ostrów", contactStudents[1], 2);
        groups[0].addStudent(students[0]);

        contactStudents[1] = new Contact("cabacka@gmail.com", "333333333",
                "Brązowa 33/3", "Malanów", "62-405");
        students[1] = new Student("Ewa", "Cabacka", "14.04.2001",
                "Malanów", contactStudents[1], 2);
        groups[0].addStudent(students[1]);

        System.out.println(groups[0].toString());
    }
}