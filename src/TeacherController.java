import java.time.LocalDate;
import java.util.List;

public class TeacherController implements UserController<Teacher>{
/*
Создание экземпляров для работы с данными.
* */
    private final TeacherService dataService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
/*
Прием teacherService и teacherView.
* */
    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
    }
/*
Создание нового учителя.
* */
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

}
