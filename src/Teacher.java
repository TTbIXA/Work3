import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{
/*
Индетификатор учителя.
* */
    private Long teacherId;
/*
Создание учителя.
* */
    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long countMaxId) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
/*
Возращение идентификатора учителя.
* */
    public Long getTeacherId() {
        return teacherId;
    }
/*
Установка нового идентификатора.
* */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
