import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    /*
    Возращение списка объекта типо T.
    * */
    List<T> getAll();

    /*
    Параментры для нового пользователя.
    * */
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
