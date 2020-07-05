package pl.wkos.homework82;

public class Group {
    private int groupId;
    private String subject;
    private Student[] students;
    private Trainer[] trainers;

    public Student getStudent(int i) {
        return students[i];
    }

    public String getSubject() {
        return subject;
    }

    public Trainer getTrainer(int i) {
        return trainers[i];
    }

    public Group(int groupId, String subject, int sizeOfStudents, int sizeOfTrainers) {
        this.groupId = groupId;
        this.subject = subject;
        this.students = new Student[sizeOfStudents];
        this.trainers = new Trainer[sizeOfTrainers];
    }

    public void addStudent(Student student) {
        int i = 0;
        while (i < students.length && students[i] != null) i++;
        if (i < students.length) {
            students[i] = student;
        } else {
            System.out.println("Nie ma miejsca na kolejnego studenta.");
        }
    }

    public boolean studentExist(Student student) {
        for (Student item : students)
            if (item == student) return true;
        return false;
    }

    public int getIndexOfStudent(Student student) {
        int i = 0;
        while (i < students.length && students[i] != student) i++;
        return i < students.length ? i : -1;
    }

    public void addTrainer(Trainer trainer) {
        int i = 0;
        while (i < trainers.length && trainers[i] != null) i++;
        if (i < trainers.length) {
            trainers[i] = trainer;
        } else {
            System.out.println("Nie ma miejsca na kolejnego trenera");
        }
    }

    @Override
    public String toString() {
        int sizeOfTrainers = trainers.length;
        int sizeOfStudents = students.length;
        String buffer = "Grupa " + groupId + "\n\t" +
                "Przedmiot\n\t\t" + subject + "\n\t\t" +
                "Trenerzy\n\t\t\t";
        for (Trainer item : trainers)
            if (item != null)
                buffer += item.toString() + "\n\t\t";
        buffer += "Studenci\n\t\t\t";
        for (Student item : students)
            if (item != null)
                buffer += item.toString() + "\n\t\t\t";
        return buffer;
    }

    public int getGroupId() {
        return groupId;
    }
}
