import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
/*
реализация интерфейса UserController с обобщенным типом Student.
* */
public class StudentController implements UserController<Student>{
/*
Создание экземпляров сериса и предоставление.
* */
    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
/*
 Создание нового студента.
* */
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(dataService.getAll());
    }
/*
Создание группу студентов.
* */
    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }
/*
Поиск студента в группе по имени и фамилии.
* */
    public void getStudentInStudentGroup(String firstName, String secondName){
        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentView.sendOnConsole(Collections.singletonList(student));
    }
/*
Получение отсортированного списка студентов из группы и выввод его.
* */
    public void getSortedListStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedStudentGroup();
        studentView.sendOnConsole(students);
    }
/*
Сортировка студентов по ФИО
* */
    public void getSortedListByFIOStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentView.sendOnConsole(students);
    }
}
