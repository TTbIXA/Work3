import java.util.List;

public class StudentGroup implements Iterable<Student>{
    /*
    Поля класса, предоставляющие список студентов и учителя группы.
    * */

    private List<Student> students;
    private Teacher teacher;
/*
Иницилизация группы студентов и назначение учителя.
* */
    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }
/*
Метод возращения списка студентов.
* */
    public List<Student> getStudents() {
        return students;
    }
/*
Установка нового списка студентов.
* */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
/*
Возращение учителя группы.
* */
    public Teacher getTeacher() {
        return teacher;
    }
/*
Установка нового учителя.
* */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
/*
Отображение состояния.
* */
    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }
/*
Переборка студетов группы.
* */
    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
