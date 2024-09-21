import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
/*
Принцип: Encapsulation. Упростите код и сделайте его более читабельным.
* */
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
/*
Принцип: Fail Fast. Предотвращение возможных исключений.
* */
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}

