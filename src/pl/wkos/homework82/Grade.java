package pl.wkos.homework82;

public class Grade {
    private Student student;
    private Group group;
    private int grade;

    public Grade(Student student, Group group, int grade) {
        this.student = student;
        this.group = group;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public Group getGroup() {
        return group;
    }

    public int getGrade() {
        return grade;
    }
}
