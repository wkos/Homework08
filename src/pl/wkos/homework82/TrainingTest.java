package pl.wkos.homework82;

import static pl.wkos.homework82.StrUtil.*;

public class TrainingTest {
    public static void main(String[] args) {
        int numberOFGroups = 2;
        int maxNumberOfStudentsInGroup = 3;
        Grade[][] grades = new Grade[numberOFGroups][maxNumberOfStudentsInGroup];

        Group[] groups = new Group[2];
        groups[0] = new Group(1, "java", 3, 1);
        groups[1] = new Group(2, "C++", 3, 1);

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
        groups[1].addTrainer(trainers[1]);

        Contact[] contactStudents = new Contact[3];
        Student[] students = new Student[3];

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

        groups[1].addStudent(students[0]);

        contactStudents[2] = new Contact("ebacka@gmail.com", "555555555",
                "Biała 55/5", "Zatorów", "62-435");
        students[2] = new Student("Ela", "Ebacka", "14.04.2001",
                "Zatorów", contactStudents[2], 2);
        groups[1].addStudent(students[2]);

        grades[0][0] = new Grade(students[0], groups[0], 5);
        grades[1][0] = new Grade(students[0], groups[1], 3);
        //groups[0].addGrade(students[0], 5);
        //groups[1].addGrade(students[0], 3);

        System.out.println(groups[0].toString());
        System.out.println(groups[1].toString());

        Student currentStudent = students[0];
        System.out.println(currentStudent.showBasicDataOfStudent());
        showStudentsGrades(currentStudent, grades);
    }

    public static void showStudentsGrades(Student student, Grade[][] grades) {
        String buffer = "";
        for (Grade[] itemGroup : grades)
            for (Grade itemStudent : itemGroup)
                if (itemStudent!=null && itemStudent.getStudent() == student)
                    System.out.printf("\t%-20s%d\n", itemStudent.getGroup().getSubject(), itemStudent.getGrade());
    }
}