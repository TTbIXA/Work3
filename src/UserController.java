import java.time.LocalDate;

public interface UserController<T extends User>{
    /*
    Параментры для нового пользователя.
    * */
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
