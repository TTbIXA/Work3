import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    /*
    Хранение информации о группе студентов.
    * */
    private StudentGroup studentGroup;
/*
Создание новой группы студентов, используя переданного учителя и списка студентов.
* */
    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }
/*
Возращение текущей группы студентов.
* */
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
/*
Поиск студента по имени и фамилии и созднаие списка для хранения.
* */
    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        /*
        Выброс исклучения.
        * */
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }
/*
Возращение отсортированного списка студентов.
* */
    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }
/*
Сортировка через компаратор.
* */
    public List<Student> getSortedByFIOStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
