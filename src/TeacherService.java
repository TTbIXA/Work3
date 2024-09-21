import javax.swing.plaf.LabelUI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
/*
Хранение списка учителей.
* */
    private final List<Teacher> teachers;
/*
Инициализация teacher как новый пустой ArrayList.
* */
    public TeacherService(){
        this.teachers = new ArrayList<>();
    }

/*
Возращение списка всех учителей.
* */

    @Override
    public List<Teacher> getAll() {
        return new ArrayList<>(teachers);
    }
/*
Создание нового учителя.
* */
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher : teachers){
            Long teacherId = teacher.getTeacherId();
          if (teacherId != null && teacherId > countMaxId){
              countMaxId = teacherId;
          }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);

    }
}
