import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
/*
Хранения списка студентов.
* */
    private final List<Student> students;
/*
Инициальзация списка студентов как пустой ArrayList.
* */
    public StudentService() {
        this.students = new ArrayList<>();
    }
/*
Возвращение текущего списка студентов.
* */
    @Override
    public List<Student> getAll() {
        return students;
    }
/*
Создание нового студента.
* */
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Student student: students){
            if (student.getStudentId() > countMaxId){
                countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }
}