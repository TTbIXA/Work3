import javax.swing.plaf.LabelUI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{

    private final List<Teacher> teachers;

    public TeacherService(){
        this.teachers = new ArrayList<>();
    }



    @Override
    public List<Teacher> getAll() {
        return new ArrayList<>(teachers);
    }

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
