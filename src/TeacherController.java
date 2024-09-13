import java.time.LocalDate;
import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService dataService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

}
